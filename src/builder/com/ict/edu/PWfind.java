package builder.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pwfind extends Pw_Find_VO {
	public void pwFind()  {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	try {
		System.out.println("디비창 들어옴!!");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##kimsangwoo";
		String password = "1111";
		conn = DriverManager.getConnection(url, user, password);
//			Frame_Sample pw_frame = new Frame_Sample();
		String input_Id = getInput_Id();
		String input_Pw = getInput_Pw();
		String sql = "SELECT * FROM MEMBER_TEST WHERE ID = ?";
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, input_Id);
		rs = pstm.executeQuery();

		
		while(rs.next()) {
			System.out.println("RS 안");
			System.out.println("디비 창 : " + input_Id);
			System.out.println("디비 창 : " + input_Pw);
			System.out.println("디비 자료" + rs.getString(1));
			System.out.println("디비 자료" + rs.getString(2));
			// 로그인
			if (rs.getString(1).equalsIgnoreCase(input_Id) && rs.getString(2).equalsIgnoreCase(input_Pw)) {
				System.out.println("일치! 로그인 성공!");
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