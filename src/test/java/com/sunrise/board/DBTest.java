package com.sunrise.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) {
		// 드라이버 검색 (db와 연동 준비)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 검색 실패");
			System.exit(0);
		}
		// 데이터베이스 연결 - 커넥션 만들기
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "tiger");
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패");
			System.exit(0);
		}
		try {
			if (conn != null) {
				conn.close();
				System.out.println("데이터베이스 연결 해제");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
