package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;


// 카드 레이아웃 : 카드가 뒤집혀진 상태에서 이벤트가 발생하면 하나씩 보여주는 형태의 레이아웃
//				(여기서 카드란, JPanel이라고 생각하면 됨) 
public class Ex01_CardLayout extends JFrame {
	JPanel card1, card2, card3, card4, card5, pg1, pg2;
	JButton jb1, jb2, jb3, jb4;
	CardLayout cardLayout;
	
	
	public Ex01_CardLayout() {
		super("카드 레이아웃");
		
		card1 = new JPanel();
		card1.setLayout(new BorderLayout());
		card1.setBackground(Color.pink);
		card1.add(new JLabel("첫번째 카드", JLabel.CENTER));
		
		card2 = new JPanel();
		card2.setLayout(new BorderLayout());
		card2.setBackground(Color.blue);
		card2.add(new JLabel("두번째 카드", JLabel.CENTER));
		card3 = new JPanel();
		card3.setLayout(new BorderLayout());
		card3.setBackground(Color.cyan);
		card3.add(new JLabel("세번째 카드", JLabel.CENTER));
		card4 = new JPanel();
		card4.setLayout(new BorderLayout());
		card4.setBackground(Color.gray);
		card4.add(new JLabel("네번째 카드", JLabel.CENTER));
		card5 = new JPanel();
		card5.setLayout(new BorderLayout());
		card5.setBackground(Color.lightGray);
		card5.add(new JLabel("5번째 카드", JLabel.CENTER));
		
		// pg1을 카드레이아웃으로 변경하자
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);

		// pg1 카드레이아웃으로 변경되었으므로 카드를 추가하자.
		// pg1.add("호출이름", 해당 컨테이너 (카드JPanel));
		// 해당 카드를 호출할때는 show(cardLayout, "호출이름");
		pg1.add("1", card1);
		pg1.add("2", card2);
		pg1.add("3", card3);
		pg1.add("4", card4);
		pg1.add("5", card5);
		
		// 첫 카드를 지정하지 않으면 맨 처음 카드가 나온다.
		// 첫 카드를 지정하자.
		cardLayout.show(pg1, "3");
		
		pg2 = new JPanel();
		jb1 = new JButton("<<");
		jb2 = new JButton("<");
		jb3 = new JButton(">");
		jb4 = new JButton(">>");
		pg2.add(jb1);
		pg2.add(jb2);
		pg2.add(jb3);
		pg2.add(jb4);
		
		add(pg1, BorderLayout.CENTER);
		add(pg2, BorderLayout.SOUTH);
		
//		pack();
		setLocationRelativeTo(null);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Anonymous inner type 형식
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "1");
				cardLayout.first(pg1);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(pg1);
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				while (i < 100) {
				try {
		            TimeUnit.SECONDS.sleep(1);

				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cardLayout.next(pg1);
				i++;
				}
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "5");
				cardLayout.last(pg1);
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex01_CardLayout();
	}
}
