package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04_PreparedStatement_Delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 CustId : ");
		int custid = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 보통은 primary key를 이용해서 삭제한다. (기본)
			String sql = "DELETE FROM CUSTOMER WHERE CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1,custid);
	
			result = pstm.executeUpdate();
//			rs = pstm.executeQuery();
			// select만 executeQuery()임. insert 등은 위에거 써야함!!
			if(result>0) {
				sql = "SELECT * FROM CUSTOMER ORDER BY CUSTID ASC";
				// ? 없으면 그냥 아래처럼 넣으면 됨!!
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패");
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
