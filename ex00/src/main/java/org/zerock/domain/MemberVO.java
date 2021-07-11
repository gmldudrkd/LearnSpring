package org.zerock.domain;

import java.util.Date;

public class MemberVO {
	
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	public String getuserid() {
		return userid;
	}
	public MemberVO setuserid(String userid) {
		this.userid = userid;
		return this;
	}
	
	public String getusername() {
		return username;
	}
	public MemberVO setusername(String username) {
		this.username = username;
		return this;
	}
	
	public String getuserpw() {
		return userpw;
	}
	public MemberVO setuserpw(String userpw) {
		this.userpw = userpw;
		return this;
	}
	
	public String getemail() {
		return email;
	}
	public MemberVO setemail(String email) {
		this.email = email;
		return this;
	}
	
	public Date getregdate() {
		return regdate;
	}
	public MemberVO setregdate(Date regdate) {
		this.regdate = regdate;
		return this;
	}
	
	public Date getupdatedate() {
		return updatedate;
	}
	public MemberVO setupdatedate(Date updatedate) {
		this.updatedate = updatedate;
		return this;
	}

}
