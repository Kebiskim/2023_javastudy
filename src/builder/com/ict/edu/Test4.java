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

public class Test4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test4 window = new Test4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("비밀번호 찾기");
		frame.setBounds(100, 100, 720, 1280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button button_1 = new Button("Find");
		button_1.setForeground(new Color(255, 240, 245));
		button_1.setBackground(new Color(65, 105, 225));
		button_1.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 12));
		button_1.setBounds(125, 398, 60, 25);
		panel.add(button_1);
		
		Button button_2 = new Button("Cancel");
		button_2.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 12));
		button_2.setForeground(new Color(255, 240, 245));
		button_2.setBackground(new Color(65, 105, 225));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(295, 398, 60, 25);
		panel.add(button_2);
		
		JTextPane txtpnFindYourPw = new JTextPane();
		txtpnFindYourPw.setForeground(new Color(65, 105, 225));
		txtpnFindYourPw.setBackground(new Color(255, 240, 245));
		txtpnFindYourPw.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		txtpnFindYourPw.setText("FIND YOUR PW");
		txtpnFindYourPw.setToolTipText("");
		txtpnFindYourPw.setBounds(125, 130, 230, 50);
		panel.add(txtpnFindYourPw);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(190, 252, 165, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(190, 312, 165, 25);
		panel.add(textField_1);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setToolTipText("");
		txtpnId.setText("ID");
		txtpnId.setForeground(new Color(65, 105, 225));
		txtpnId.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		txtpnId.setBackground(new Color(255, 240, 245));
		txtpnId.setBounds(125, 252, 50, 25);
		panel.add(txtpnId);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setToolTipText("");
		txtpnEmail.setText("Email");
		txtpnEmail.setForeground(new Color(65, 105, 225));
		txtpnEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		txtpnEmail.setBackground(new Color(255, 240, 245));
		txtpnEmail.setBounds(125, 312, 73, 25);
		panel.add(txtpnEmail);
	}
}
