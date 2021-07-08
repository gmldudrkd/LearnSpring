package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

//JDBC연결 테스트코드
public class MysqlconnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URI = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false";
	private static final String USER = "root";
	private static final String PW = "gmldud0810!";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URI,USER,PW)) {
			System.out.println(con);
		}catch(Exception e) {
			
		}
	}
}
