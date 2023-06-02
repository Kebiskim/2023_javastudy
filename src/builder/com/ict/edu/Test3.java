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

public class Test3 {

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
					Test3 window = new Test3();
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
	public Test3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("안녕");
		frame.setBounds(100, 100, 472, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button button_1 = new Button("찾기");
		button_1.setForeground(new Color(255, 240, 245));
		button_1.setBackground(new Color(65, 105, 225));
		button_1.setFont(new Font("Segoe Script", Font.PLAIN, 12));
		button_1.setBounds(116, 398, 60, 25);
		panel.add(button_1);
		
		Button button_4 = new Button("cancel");
		button_4.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		button_4.setForeground(new Color(255, 240, 245));
		button_4.setBackground(new Color(65, 105, 225));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(267, 398, 76, 25);
		panel.add(button_4);
		
		JTextPane txtpnFindYourPw = new JTextPane();
		txtpnFindYourPw.setForeground(new Color(65, 105, 225));
		txtpnFindYourPw.setBackground(new Color(255, 240, 245));
		txtpnFindYourPw.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		txtpnFindYourPw.setText("FIND YOUR PW");
		txtpnFindYourPw.setToolTipText("");
		txtpnFindYourPw.setBounds(116, 130, 263, 65);
		panel.add(txtpnFindYourPw);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(181, 252, 180, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 312, 180, 25);
		panel.add(textField_1);
		
		JTextArea txtrId = new JTextArea();
		txtrId.setText("ID");
		txtrId.setBounds(96, 252, 66, 23);
		panel.add(txtrId);
		
		JTextArea txtrId_1 = new JTextArea();
		txtrId_1.setText("이메일");
		txtrId_1.setBounds(96, 312, 66, 23);
		panel.add(txtrId_1);
	}
}
