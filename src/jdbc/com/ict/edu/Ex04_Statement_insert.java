package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// insert
public class Ex04_Statement_insert {
	public static void main(String[] args) {
		// 접속과 처리를 위한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// insert (6번, 이강인, 대한민국 서울, 000-9000-0001) 추가
			String sql = "INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) " 
					+ " VALUES(10, '이강인', '대한민국 서울', '000-9000-0001')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			// insert는 이 부분이 0 아니면 1
			// update는 다른 것 5 도 될 수 있다!
			
			if (result > 0) {
				// 성공하면 select문을 이용해서 오름차순 정렬해서 보자
				sql = "SELECT * FROM CUSTOMER ORDER BY CUSTID ASC";
				// 아래줄 생략 가능!!
//				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString("CUSTID")+"\t");
					System.out.print(rs.getString("NAME")+"\t");
					System.out.print(rs.getString("ADDRESS")+"\t");
					System.out.print(rs.getString("PHONE")+"\n");
				}
			}else {
				System.out.println("삽입 실패1");
			}
		} catch (Exception e) {
			// insert의 경우는 오류 시 아래로 떨어지는 경우가 거의 대부분!
			System.out.println("제대로 된 데이터를 넣어주세요 : " + e);
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
