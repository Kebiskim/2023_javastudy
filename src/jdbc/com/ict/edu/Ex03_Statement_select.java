package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// customer 테이블에서 박씨 성을 가진 사람의 모든 정보를 검색하자. 
public class Ex03_Statement_select {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url =  "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM CUSTOMER WHERE NAME LIKE '박%'";
					
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString("CUSTID")+'\t');
				System.out.print(rs.getString("NAME")+'\t');
				System.out.print(rs.getString("ADDRESS")+'\t');
				System.out.print(rs.getString("PHONE")+'\n');
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
