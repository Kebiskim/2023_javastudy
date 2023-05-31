package jdbc.com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 1. 자바와 오라클을 연결하기 위해서 ojdbc8.jar를 다운받고 util에 넣었다.
// 2. 프로젝트와 ojdbc8.jar 등록하자.
//왼쪽 파일(프로젝트) 아이콘에서 마우스 오른쪽 -> Build Path -> Configure Build Path
//-> 세번째 탭 Libraries -> ModulePath -> add External Jar → 다운받은 파일 추가 → apply and close
public class Ex01_Statement_select {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;
		
		// 3-1. select문의 결과를 받는 클래스
		ResultSet rs = null;
		// 3-2. select문을 제외한(delete, update, insert) 결과를 받는 변수
		int result = 0;
		
		// 4. jdbc 드라이버 로딩 : 오라클, MySQL 등 각각 내용이 다르다.
		// ★★ 확장자가 class파일인 것은 읽을 수 없음 (JVM이 읽을 수 있음) .java랑 다름!
		// 이걸 읽어야 접속할 수 있음 (밑에 파일)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 접속하기 위한 정보 저장
			//	  오라클, MySQL 각각 내용이 다르다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			// 나중에 DB 공유할 때는 localhost 주소 써주면 됨.
			
			// 6. 접속하기 : 
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. SQL 작성하기 (★ SQL이니까 대문자도 가능함!!)
			String sql = "SELECT * FROM 고객테이블";
			
			// 8. SQL을 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();
			
			// 9. SQL을 담아서 보내고 결과 받기
			// 9-1. select
			rs = stmt.executeQuery(sql);
			// 9-2 select 제외 (insert, update, delete)
//			result = stmt.executeUpdate(sql);
			
			while (rs.next()) {
//				System.out.print(rs.getString(1) + "\t");
//				System.out.print(rs.getString(2) + "\t");
//				System.out.print(rs.getString(3) + "\t");
//				System.out.print(rs.getString(4) + "\t");
//				System.out.print(rs.getString(5) + "\t");
//				System.out.print(rs.getString(6) + "\n");
				
				System.out.print(rs.getString("고객아이디")+"\t");
				System.out.print(rs.getString("고객이름")+"\t");
				System.out.print(rs.getString("나이")+"\t");
				System.out.print(rs.getString("등급")+"\t");
				System.out.print(rs.getString("직업")+"\t");
				System.out.print(rs.getString("적립금")+"\n");
			} 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
