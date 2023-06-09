package jdbc.com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
//							 비즈니스로직을 분리하기 위해서 사용

// DB에 접속해서 각종 SQL을 처리하는 클래스

// * 싱글턴 - new를 해도, 새로 생성된 이후에는 새로 만들어지지 않는다!!
// 싱글턴 패턴 : 소프트웨어 디자인 패턴에서 사용하는 패턴 중 하나이다.
//			  생성자가 여러차례 호출 되더라도 실제 생성되는 객체는 하나이고,
//			  최초 생성 이후에는 호출된 생성자는 최초 생성자가 생성한 객체를 리턴한다.
//			  가장 대표적인 것이 spring으로, 기본적으로 싱글턴 패턴을 사용한다.

public class DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	
	private static DAO dao = new DAO();
	public static DAO getInstance() {
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
	
	// DB에 접근후 원하는 메서드를 만들어서 사용
	
	// 전체보기 메서드
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "SELECT * FROM 고객테이블";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\n");
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
	
	// 아이디를 받아서 해당 아이디를 가지고 있는 사람의 정보 검색
	public void getSelectOne(String c_id) {
		try {
			conn = getConnection();
			String sql = "SELECT * FROM 고객테이블 WHERE 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_id);
			rs = pstm.executeQuery();
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			while (rs.next()) {
				for (int i = 1; i < 7; i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
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
	
	public void getInsert(String c_id2, String c_name, String c_age, 
			String c_rank, String c_job, String c_point) { 
		String[] arr = {c_id2, c_name, c_age, c_rank, c_job, c_point};
		try {
			conn = getConnection();
			String sql = "INSERT INTO 고객테이블 VALUES(?, ?, ?, ?, ?, ?)";
			pstm.getConnection().prepareStatement(sql);
			for (int i = 1; i < 7; i++) {
				pstm.setString(i, arr[i]);
			}
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {

		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
	
	public void getDelete(String c_id3) {
		try {
			conn = getConnection();
			String sql = "DELETE FROM 고객테이블 WHERE 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_id3);
			result = pstm.executeUpdate();
			if(result > 0) {
				getSelectAll();
			}else {
				System.out.println("없는 아이디 입니다.");
			}
		} catch (Exception e) {
			
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	public void getUpdate(String c_id, String c_name, String c_age, 
			String c_rank, String c_job, String c_point) {
		try {
			conn = getConnection();
			String sql = "UPDATE 고객테이블 SET 고객이름 = ?, 나이 = ?, 등급 = ?, "
					+ "직업 = ?, 적립금 = ? WHERE 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,  c_name);
			pstm.setString(2,  c_age);
			pstm.setString(3,  c_rank);
			pstm.setString(4,  c_job);
			pstm.setString(5,  c_point);
			pstm.setString(6,  c_id);
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {
			
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
