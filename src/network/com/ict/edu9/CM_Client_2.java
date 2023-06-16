package network.com.ict.edu9;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import network.com.ict.edu8.VO;

public class CM_Client_2 extends JFrame implements Runnable {
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
    JTextField jtf1, jtf2, jtf3, jtf4;
    JButton jb1, jb2, jb3, jb4;
    JTextArea jta;
    JScrollPane jsp;
	List<VO> list = null;
	private String custid;
	private String name;
	private String address;
	private String phone;
	
	// 접속
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	String msg;

	public CM_Client_2() {
		super("DB 연동 정보");
        jp1 = new JPanel(new GridLayout(0, 2));
        jp2 = new JPanel(new GridLayout(0, 2));
        jp3 = new JPanel(new GridLayout(0, 2));
        jp4 = new JPanel(new GridLayout(0, 2));
        jp5 = new JPanel(new GridLayout(4, 0));
        jp6 = new JPanel();

        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jtf4 = new JTextField();

        jb1 = new JButton("전체보기");
        jb2 = new JButton("삽입");
        jb3 = new JButton("삭제");
        jb4 = new JButton("검색");

        jp1.add(new JLabel("CUSTID  :  ", JLabel.CENTER));
        jp1.add(jtf1);

        jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
        jp2.add(jtf2);

        jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
        jp3.add(jtf3);

        jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
        jp4.add(jtf4);

        jp5.add(jp1);
        jp5.add(jp2);
        jp5.add(jp3);
        jp5.add(jp4);

        jta = new JTextArea();
        jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jta.setLineWrap(true);
        jta.setEditable(false);

        jp6.add(jb1);
        jp6.add(jb2);
        jp6.add(jb3);
        jp6.add(jb4);

        add(jp5, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        add(jp6, BorderLayout.SOUTH);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		jta.setFont(new Font("굴림", Font.PLAIN, 15));
		
		connected();
		
		
       
        jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(s!=null) {
					try {
						VO_2 vo = new VO_2();
						vo.setCmd(0);
						out.writeObject(vo);
						out.flush();
					} catch (Exception e2) {
					}
				}else {
					closed();
				}
			}
		});
        
        jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				// custid가 null이면 삽입불가
				// and 조건
				if (name.length() > 0 | address.length() > 0 | phone.length() > 0) {
					jta.setText("");
					Protocol p = new Protocol();
					p.setName(name);
					p.setAddress(address);
					p.setPhone(phone);
//						}else {
//							JOptionPane.showMessageDialog(getParent(), "같은 custid가 존재합니다");
//						}
//					}else {
//						JOptionPane.showMessageDialog(getParent(), "custid를 입력하세요");
//					}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
        			
        // 삭제 버튼 기능 구현
        jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				if(custid.length() > 0) {
						VO vo = new VO();
						vo.setCustid(custid);
						int result = DAO.getDelete(vo);
						if (result > 0) {
							JOptionPane.showMessageDialog(getParent(), "삭제 성공");
							list = DAO.getList(); 
							prn(list);
							}
					}else {
						JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
					}
//					}else {
//						JOptionPane.showMessageDialog(getParent(), "삭제 실패");
//					}
//				}else {
//					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요.");
//				}
			}
		});
        
        // 불러오기 버튼 기능
        jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton)(e.getSource());
				String msg = obj.getText();
				if(msg.equals("검색")) {
					String custid = jtf1.getText().trim();
					if(custid.length()>0) {
							VO vo = new VO();
							vo.setCustid(custid);
							DAO.getOne2(vo);
							jta.setText("");
							jtf2.setText(vo.getName());
							jtf3.setText(vo.getAddress());
							jtf4.setText(vo.getPhone());
							jtf1.setEditable(false);
							jb4.setText("고치기");
							jb1.setEnabled(false);
							jb2.setEnabled(false);
							jb3.setEnabled(false);
					}else {
						JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요.");
					}
				}else if (msg.equals("고치기")) {
					VO vo = new VO();
					vo.setCustid(jtf1.getText());
					vo.setName(jtf2.getText());
					vo.setAddress(jtf3.getText());
					vo.setPhone(jtf4.getText());
					int result = DAO.getUpdate(vo);
					if (result > 0) {
						JOptionPane.showMessageDialog(getParent(), "수정 성공");
						jta.setText("");
						list = DAO.getList(); 
						prn(list);
						}
					}
					jb4.setText("검색");
					jtf1.setText("");
					jtf1.setEditable(true);
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");
					jb1.setEnabled(true);
					jb2.setEnabled(true);
					jb3.setEnabled(true);
				}
		});
    } // 메인 생성자 닫기
	
	public void prn(List<VO> list) {
		jta.setText("");
		jta.append("\n\t\t 회원 전체 정보 \n\n\n");
		jta.append("번호\t이름\t주소\t전화번호\n\n");
		for (VO k : list) {
			jta.append(k.getCustid()+"\t");
			jta.append(k.getName()+"\t");
			jta.append(k.getAddress()+"\t");
			jta.append(k.getPhone()+"\n");
			
			
//				ArrayList<VO> list = DAO.getInstance().getSelectAll();
//				jta.append("\n\t\t 회원 전체 정보 \n\n\n");
//				jta.append("\t번호\t이름\t주소\t전화번호\n");
//				for (VO k : list) {
//					jta.append("  " + k.getCustid() + "\t");
//					jta.append(k.getName() + "\t");
//					jta.append(k.getAddress() + "\t");
//					jta.append(k.getPhone() + "\n");
//				}
		}
	}
	
	
	// 끝내기
	public void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}
		
		public static void main(String[] args) {
			new CM_Client();
		}

		@Override
		public void run() {
			
		}
	}

	private void connected() {
		try {
			s = new Socket("192.168.0.69", 7780);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
		} catch (Exception e) {
			
		}				
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

	
}
