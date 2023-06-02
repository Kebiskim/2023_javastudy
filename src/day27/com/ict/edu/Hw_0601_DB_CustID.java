package day27.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw_0601_DB_CustID extends JFrame implements ActionListener {
	// 컴포넌트 선언부
	JPanel jp, jp2, jp3, jp4, jp5, jp6, pg1, pg2;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	JScrollPane jsp;
	
	String custid = "";
	String name = "";
	String address = ""; 
	String phone = "";
	String sql = "";
	String sql_query = "";
	
	public Hw_0601_DB_CustID() {
		super("DB 연동 정보");
		
		pg1 = new JPanel();
		pg1.setLayout(new GridLayout(4, 2, 0, 0)); 
		jp3 = new JPanel();
		jl1 = new JLabel("CUSTID : ");
        jl1.setHorizontalAlignment(JLabel.CENTER); //JLabel 가운데 정렬
		jtf1 = new JTextField(15);
		pg1.add(jl1);
		pg1.add(jtf1);
		jp4 = new JPanel();
		jl2 = new JLabel("NAME : ");
        jl2.setHorizontalAlignment(JLabel.CENTER); 

		jtf2 = new JTextField(15);
		pg1.add(jl2);
		pg1.add(jtf2);
		jp5 = new JPanel();
		jl3 = new JLabel("ADDRESS : ");
		jl3.setHorizontalAlignment(JLabel.CENTER); 
		jtf3 = new JTextField(15);
		pg1.add(jl3);
		pg1.add(jtf3);
		jp6 = new JPanel();
		jl4 = new JLabel("PHONE : ");
		jl4.setHorizontalAlignment(JLabel.CENTER); 
		jtf4 = new JTextField(15);
		pg1.add(jl4);
		pg1.add(jtf4);
				
		jp2 = new JPanel();
		jta = new JTextArea();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");
		jb6.setEnabled(false);
		jp2.add(jb1);
		jp2.add(jb2);		
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		jta = new JTextArea(15, 50);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		add(pg1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 전체보기
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sql = "SELECT * FROM CUSTOMER ORDER BY CUSTID ASC";
				sql_query = "전체보기";
				jta.setText("");
				db_Connection(sql);
			}
		});
		// 삽입
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				custid = jtf1.getText();
				name = jtf2.getText();
				address = jtf3.getText();
				phone = jtf4.getText();
				sql_query = "삽입";
				jta.setText("");
				// ★ 맨 끝에 ; 넣으면 안된다!!!
				sql = "INSERT INTO CUSTOMER VALUES(" + custid + ", '" + name + "', '" + address + "', '" +  phone + "')";
//				System.out.println(sql);
				db_Connection(sql);
			}
		});
		// 삭제
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				custid = jtf1.getText();
				sql = "DELETE FROM CUSTOMER WHERE CUSTID = " + custid;
				sql_query = "삭제";
				jta.setText("");
				db_Connection(sql);
			}
		});
		// 불러오기
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				custid = jtf1.getText();
				sql = "SELECT * FROM CUSTOMER WHERE CUSTID = " + custid;				
				sql_query = "불러오기";
				jta.setText("");
				db_Connection(sql);
//				// 하단 부분 구현 가능?
//				if (jta.getText() == "") {
//					jta.setText("해당 CUSTID는 존재하지 않습니다.");
//				}
			}
		});
		// 고치기
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sql = "SELECT * FROM CUSTOMER";
				db_Connection(sql);
			}
		});
	}
	private void db_Connection(String sql) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##kimsangwoo";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (sql_query == "전체보기") {
				while (rs.next()) {
					jta.append(rs.getString(1)+"    " + rs.getString(2)+"    " + 
							rs.getString(3)+"    " + rs.getString(4)+"\n");
				}
			}
			if (sql_query == "삽입") {
				jta.append(custid + "열이 삽입되었습니다.");
			}
			if (sql_query == "삭제") {
				jta.append(custid + "열이 삭제되었습니다.");
			}
			if (sql_query == "불러오기") {
				while (rs.next()) {
					jta.append(rs.getString(1)+"    " + rs.getString(2)+"    " + 
							rs.getString(3)+"    " + rs.getString(4)+"\n");
				}
			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
		} catch (Exception e) {
			jta.setText("내용이 잘못되었습니다. (상단 입력부를 확인하세요.)");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {				
			}
		}
	}

	
	public static void main(String[] args) {
		new Hw_0601_DB_CustID();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}