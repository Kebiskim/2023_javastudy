package builder.com.ict.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import javax.swing.JMenu;
import java.awt.Button;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JEditorPane;
import java.awt.Label;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Frame_Sample {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private String input_Id = "";
	private String input_Pw = "";
	DBConnection db_con = new DBConnection();
	PWfind pwFind = new PWfind();
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Frame_Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("비밀번호 찾기");
		// 화면 사이즈 (540 * 960)
		int horizontal_size = 540;
		int vertical_size = 960;
		// 화면 사이즈 고정
		frame.setResizable(false);
		// 버튼 사이즈 (100 * 30)
		int button_width = 100;
		int button_height = 30;
		// ★ 배경색 (연분홍)
		// component.setBackground(new Color(255, 240, 245));
		// ★ 글씨색, 글씨체 및 버튼색 (연남색)
		// component.setFont(new Font("Comic Sans MS", Font.BOLD, size));
		// component.setForeground(new Color(65, 105, 225));
		// component.setBackground(new Color(65, 105, 225));
		
		frame.setBounds(100, 100, horizontal_size, vertical_size);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button button_1 = new Button("Find");
		button_1.setForeground(new Color(255, 240, 245));
		button_1.setBackground(new Color(65, 105, 225));
		button_1.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 14));
		button_1.setBounds(130, 420, 100, 30);
		panel.add(button_1);
		
		
		Button button_2 = new Button("Cancel");
		button_2.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 14));
		button_2.setForeground(new Color(255, 240, 245));
		button_2.setBackground(new Color(65, 105, 225));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(300, 420, button_width, button_height);
		panel.add(button_2);
		
		// 페이지 제목 (FIND YOUR PW)
		JTextPane txtpnFindYourPw = new JTextPane();
		txtpnFindYourPw.setForeground(new Color(65, 105, 225));
		txtpnFindYourPw.setBackground(new Color(255, 240, 245));
		txtpnFindYourPw.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		txtpnFindYourPw.setText("FIND YOUR PW");
		txtpnFindYourPw.setToolTipText("");
		txtpnFindYourPw.setBounds(100, 130, 330, 60);
		txtpnFindYourPw.setEditable(false);
		panel.add(txtpnFindYourPw);
		
		
	
		JTextPane txtpnId = new JTextPane();
		txtpnId.setToolTipText("");
		txtpnId.setText("ID");
		txtpnId.setForeground(new Color(65, 105, 225));
		txtpnId.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		txtpnId.setBackground(new Color(255, 240, 245));
		txtpnId.setBounds(130, 247, 35, 35);
		txtpnId.setEditable(false);
		panel.add(txtpnId);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setToolTipText("");
		txtpnEmail.setText("Email");
		txtpnEmail.setForeground(new Color(65, 105, 225));
		txtpnEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		txtpnEmail.setBackground(new Color(255, 240, 245));
		txtpnEmail.setBounds(125, 307, 75, 25);
		txtpnEmail.setEditable(false);
		panel.add(txtpnEmail);
		
		textField = new JTextField();
		// ID, 비밀번호 입력 칸 (textField)
		textField.setBounds(200, 250, 200, 25);
		panel.add(textField);
		textField.setColumns(10);
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 310, 200, 25);
		panel.add(passwordField);
		
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_Id = textField.getText();
				input_Pw = passwordField.getText();
				pwFind.pwFind();
				System.out.println("버튼");
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
	
	public String getinput_Id() {
		return input_Id;
	}

	public void setinput_Id(String input_Id) {
		this.input_Id = input_Id;
	}

	public String getinput_Pw() {
		return input_Pw;
	}

	public void setinput_Pw(String input_Pw) {
		this.input_Pw = input_Pw;
	}

	public void PW_find_execute() {
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Sample window = new Frame_Sample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
