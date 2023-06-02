package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex03_PreparedStatement_Insert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("custid : ");
		int custid = scan.nextInt();
		System.out.println("name : ");
		String name = scan.next();
		System.out.println("address : ");
		String address = scan.next();
		System.out.println("phone : ");
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
			
			String sql = "INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(?,?,?,?)";
			// ? => 바인딩변수 
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1,custid);
			pstm.setString(2, name);
			pstm.setString(3, address);
			pstm.setString(4, phone);
			
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
