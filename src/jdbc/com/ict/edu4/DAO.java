package jdbc.com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao;
	}
	
	// DB접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {

		}
		return null;
	}
	
	public ArrayList<VO> getSelectAll() {
		try {
			conn = getConnection();
			String sql = "SELECT * FROM 고객테이블";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ArrayList<VO> list = new ArrayList<>();
			while(rs.next()) {
				VO vo = new VO();
			}
		} catch (Exception e) {

		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	public VO getSelectedOne(String c_id) {
		
	}
}
