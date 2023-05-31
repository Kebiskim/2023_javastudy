package jdbc.com.ict.edu3;

import java.sql.*;

// 1. 자바와 오라클 연결을 위해서 ojdbc8.jar를 다운받고 util 폴더에 넣었다.
// 2. 프로젝트와 ojdbc8.jar 등록하자.
// 왼쪽 파일(프로젝트)아이콘에서 마우스 오른쪽 -> Build Path -> Configure Build Path
public class Ex02_Statement_select {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속
		Connection conn = null;
		// 2. SQL 구문 작성을 도와줌.
		Statement stmt = null;
		
		// 3-1. select문의 결과를 받음
		ResultSet rs = null;
		// 3-2. select문을 제외한 delete, insert, update 결과를 받을 변수
		int result = 0;
		
		// 4. jdbc 드라이버 로딩 : 오라클, MySQL 등 각각 내용이 다르다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			
			// 6. 접속하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. SQL 작성하기 
			String sql = "SELECT * FROM BOOK";
			
			// 8. SQL을 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();
			
			// 9. SQL을 담아서 보내고 결과 받기
			// 9-1. select
			rs = stmt.executeQuery(sql);
			// 9-2. select 제외 (insert, update, delete)
//			result = stmt.executeUpdate(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString("BOOKID")+"\t");
				System.out.print(rs.getString("BOOKNAME")+"\t");
				System.out.print(rs.getString("PUBLISHER")+"\t");
				System.out.print(rs.getString("PRICE")+"\n");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}			
		}
	}
}
