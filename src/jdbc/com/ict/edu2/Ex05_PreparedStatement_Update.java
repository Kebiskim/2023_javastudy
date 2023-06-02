package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05_PreparedStatement_Update {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 custid : ");
		int custid = scan.nextInt();
		System.out.print("수정할 name : ");
		String name = scan.next();
		System.out.print("수정할 address : ");
		String address = scan.next();
		System.out.print("수정할 phone : ");
		String phone = scan.next();
		
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
			
			String sql = "UPDATE CUSTOMER SET NAME = ?, ADDRESS = ?, PHONE = ? WHERE CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setString(3, phone);
			pstm.setInt(4,custid);
			
			result = pstm.executeUpdate();
//			rs = pstm.executeQuery();
			// select만 executeQuery()임. INSERT, DELETE, UPDATE는 위에거 써야함!!
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
			}
		} catch (Exception e) {
			System.out.println("삽입 실패");
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
