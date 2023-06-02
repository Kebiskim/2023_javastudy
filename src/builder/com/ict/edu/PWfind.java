package builder.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PWfind {
	
//	public PWfind() {}
	public void pwFind() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		try {
			System.out.println("가가가");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			Frame_Sample pw_frame = new Frame_Sample();
			String input_Id = pw_frame.getinput_Id();
			String input_Pw = pw_frame.getinput_Pw();
			System.out.println(input_Id);
			System.out.println(input_Pw);
			
			String sql = "SELECT * FROM MEMBER_TEST WHERE ID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, input_Id);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println("테스트중");
				if (rs.getString(1) == input_Id && rs.getString(2) == input_Pw) {
					System.out.println("로그인 성공!");
				}
			}
		} catch (Exception e) {
			System.out.println("찾기 실패");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println("찾기 실패");
			}
		}
	}
	public static void main(String[] args) {
		
	}
}