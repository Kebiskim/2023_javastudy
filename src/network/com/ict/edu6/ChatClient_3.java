package network.com.ict.edu6;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient_3 extends JFrame {
    private CardLayout card = new CardLayout();
	private JFrame frame;
	private JTextField textField;
	
	public class Frame extends JFrame{
		public Frame() {
			setSize(450, 620);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(card);
			setResizable(false);
			
			getContentPane().add("One", new P_One(this));
			getContentPane().add("Two", new P_Two(this));
			
			setVisible(true);
		}
		
		public void changePanel() {
			card.next(this.getContentPane());
		}
	}
	
	public class P_One extends JPanel {
		private JPanel panel;

		public P_One(Frame f) {
			panel = new JPanel();
			panel.setBounds(100, 100, 450, 620);
			panel.setLayout(card);
			
			JButton btnNewButton = new JButton("입장하기");
			btnNewButton.setBounds(310, 530, 100, 25);
			panel.add(btnNewButton);
			
			textField = new JTextField();
			textField.setBounds(300, 500, 120, 20);
			textField.setColumns(10);
			panel.add(textField);
			
			JLabel lblNewLabel = new JLabel("닉네임 : ");
			lblNewLabel.setBounds(240, 500, 57, 15);
			panel.add(lblNewLabel);
			
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setIcon(new ImageIcon("D:\\KSW\\kakao.png"));
			btnNewButton_1.setBounds(0, 30, 430, 430);
			panel.add(btnNewButton_1);		
			
			setVisible(true);
		}
	}	
	
	public class P_Two extends JPanel {
		private JPanel panel2;
		private JTextArea textArea;
		private JButton btnNewButton2;
		private Frame F;

		public P_Two(Frame f) {
			panel2 = new JPanel();
			panel2.setBounds(100, 100, 450, 620);
			panel2.setLayout(card);
			
			F = f;
			
			textArea = new JTextArea();
			textArea.setBounds(0, 0, 430, 535);
			panel2.add(textArea);
			
			btnNewButton2 = new JButton("메시지 전송");
			btnNewButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					F.changePanel();
				}
			});
			btnNewButton2.setBounds(325, 550, 100, 25);
			panel2.add(btnNewButton2);
			
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new ChatClient_3();
	}
	
}