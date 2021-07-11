package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository //DAO 를 스프링에 인식시키기위해 주로사용
public class MemeberDAOImpl implements MemberDAO{
	@Inject
	private SqlSession sqlSession;
	
	//root-context에 선언되어있음
	private static final String namespace = "org.zerock.mapper.MemberMapper";
	
	//MemberDAO 인터페이스에서 가져옴
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception{
		return (MemberVO)
				sqlSession.selectOne(namespace+".selectMember", userid);
	}
	
	@Override
	public MemberVO readWithPW(String userid, String pw) throws Exception{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", pw);
		
		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
	}
}
