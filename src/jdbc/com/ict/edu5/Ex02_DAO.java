package jdbc.com.ict.edu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// DB에 접속해서 각종 SQL을 처리하는 클래스
public class Ex02_DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	
	private static Ex02_DAO dao = new Ex02_DAO();
	public static Ex02_DAO getInstance() {
		return dao;
	}
	
	// DB 접속 메서드
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
	// 각종 DB처리 메서드
	// 전체보기
	public ArrayList<Ex02_VO> getSelectAll(){
		// select문 여러개 나오면 List<VO> 아니면 ArrayList<VO> 사용함
		try {
			conn = getConnection();
			String sql = "SELECT * FROM CUSTOMER ORDER BY CUSTID";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ArrayList<Ex02_VO> list = new ArrayList<>();
			while(rs.next()) {
				// VO가 while 문 안에 만들어져야 함 (밖이면 맨 마지막것만 기억함)
				Ex02_VO vo = new Ex02_VO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		}
		return null;
	}
	
	// 삽입
	public int getInsert(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE)"
					+ "VALUES(?, ?, ?, ?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			pstm.setString(2, vo.getName());
			pstm.setString(3, vo.getAddress());
			pstm.setString(4, vo.getPhone());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}
	
	// 삭제
	public int getDelete(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "DELETE FROM CUSTOMER WHERE CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}
	
	// 하나 불러오기 (검색)
	public Ex02_VO getSelectOne(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "SELECT * FROM CUSTOMER WHERE CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			rs = pstm.executeQuery();
			Ex02_VO vo2 = new Ex02_VO();
			while(rs.next()) {
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
			}
			return vo2;
		} catch (Exception e) {

		} finally {
			try {
				
			} catch (Exception e2) {

			}
		}
		return null;
	}
	
	// 고치기
	public int getUpdate(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "UPDATE CUSTOMER SET NAME = ?, ADDRESS = ?, PHONE = ? WHERE CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getName());
			pstm.setString(2, vo.getAddress());
			pstm.setString(3, vo.getPhone());
			pstm.setString(4, vo.getCustid());
			int result = pstm.executeUpdate();
			return result;
			
		} catch (Exception e) {

		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		
		return 0;
	}
	
	// 아이디 체크
	public boolean getIdChk(String custid) {
		// 중복이면 false, 중복 아니면 true
		boolean idchk = false;
		try {
			conn = getConnection();
			String sql = "SELECT COUNT(*) FROM CUSTOMER WHERE CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, custid);
//			int cnt = pstm.executeUpdate();
			rs = pstm.executeQuery();
//			System.out.println("cnt : " + cnt);
			int cnt = 0;
			if(rs.next()) {
				cnt++;
			}
			if(cnt==0) {
				idchk=true;
			}
			if (rs.isFirst()) {
				idchk = true;
			}
			return idchk;
		} catch (Exception e) {
		}
		return idchk;
	}
}	