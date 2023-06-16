package network.com.ict.edu8;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login_Page extends JPanel implements Runnable {
	private JPanel login_page;
	private JLabel img;
	private JButton login_bt;
	private JTextField nickname_tf, blank_tf; 

	public Login_Page() {
		login_page = new JPanel(new BorderLayout());
		
		img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient.class.getResource("/images/chat.png")));
		
		JPanel jp1 = new JPanel(new GridLayout(2, 1));
		JPanel jp1_1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp1_1.add(new JLabel("닉네임 : "));
		nickname_tf = new JTextField(10);
		blank_tf = new JTextField(0);
		blank_tf.setText("");
		jp1_1.add(nickname_tf);

		JPanel jp1_2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		login_bt = new JButton(" 입장하기 ");
		jp1_2.add(login_bt);

		jp1.add(jp1_1);
		jp1.add(jp1_2);

		login_page.add(img, BorderLayout.CENTER);
		login_page.add(jp1, BorderLayout.SOUTH);
		
		setSize(450, 550);
		setVisible(true);
		
		
		// 입장하기
				login_bt.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String name = nickname_tf.getText().trim();
						if (name.length() > 0) {
							// 서버 접속
							if (ChatClient.connected()) {
								try {
									// 닉네임 보내기
									Protocol p = new Protocol();
									p.setCmd(2);
									p.setMsg(name);
									ChatClient.out.writeObject(p);
									ChatClient.cardLayout.show(ChatClient.pg, "wait");

								} catch (Exception e2) {
								}
							}
						} else {
							JOptionPane.showMessageDialog(getParent(), "제발 좀! 닉네임을 입력하세요");
//							login_p.nickname_tf.setText("");
							setNickname_tf(blank_tf);
							getNickname_tf().requestFocus();
						}
					}
				});
	}
	
	public JPanel getLogin_page() {
		return login_page;
	}

	public void setLogin_page(JPanel login_page) {
		this.login_page = login_page;
	}

	public JLabel getImg() {
		return img;
	}

	public void setImg(JLabel img) {
		this.img = img;
	}

	public JButton getLogin_bt() {
		return login_bt;
	}

	public void setLogin_bt(JButton login_bt) {
		this.login_bt = login_bt;
	}

	public JTextField getNickname_tf() {
		return nickname_tf;
	}

	public void setNickname_tf(JTextField nickname_tf) {
		this.nickname_tf = nickname_tf;
	}

	@Override
	public void run() {
		
	}

}
