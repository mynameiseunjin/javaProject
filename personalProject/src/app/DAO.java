package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Data Base 연결
public class DAO {

	//database 연결정보
	private String jdbcDriver = "org.sqlite.JDBC";
	private String jdbcUrl = "jdbc:sqlite:/D:/dev/database/TestDateBase.db";
	
	//메소드에서 공통적으로 사용하는 변수를 필드로 
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	//연결
	public void connect() {
		try {
			Class.forName(jdbcDriver);
			
			conn = DriverManager.getConnection(jdbcUrl);
		}catch(ClassNotFoundException e) {
			System.out.println("로딩 실패");
		}catch(SQLException e) {
			System.out.println("연결 실패");
		}
	}
	
	//연결해제
	public void disconnect() {
		try {
			if(rs != null)rs.close();
			if(stmt != null) stmt.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			System.out.println("정상적으로 자원이 해제되지 않았습니다.");
		}
	}
}
