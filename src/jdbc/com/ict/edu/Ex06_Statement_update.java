package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// 박세리의 주소를 대한민국 제주도, 전화번호를 000-9000-0001로 변경하자.
public class Ex06_Statement_update {
	public static void main(String[] args) {
		// 접속하고 처리하기 위해서 3개의 클래스
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE CUSTOMER SET ADDRESS = '대한민국 제주도', PHONE = '000-9000-0001' WHERE NAME LIKE '박세리'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if(result > 0) {
				sql = "SELECT * FROM CUSTOMER ORDER BY CUSTID ASC";
				// 아래 생략 가능
				// stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}else {
				System.out.println("삭제 실패");
			}
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
			
			}
		}
	}
}
