package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class Hw_0530_1 extends JFrame implements ActionListener {
	// 컴포넌트 선언부
	JPanel jp, jp2, jp3, jp4, jp5, jp6, pg1, pg2;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	JScrollPane jsp;
	
	public Hw_0530_1() {
		super("DB 연동 정보");
		
		pg1 = new JPanel();
		pg1.setLayout(new GridLayout(4, 2, 0, 0)); 
		jp3 = new JPanel();
		jl1 = new JLabel("CUSTID : ");
        jl1.setHorizontalAlignment(JLabel.CENTER); //JLabel 가운데 정렬
		jtf1 = new JTextField(20);
		pg1.add(jl1);
		pg1.add(jtf1);
		jp4 = new JPanel();
		jl2 = new JLabel("NAME : ");
        jl2.setHorizontalAlignment(JLabel.CENTER); 

		jtf2 = new JTextField(20);
		pg1.add(jl2);
		pg1.add(jtf2);
		jp5 = new JPanel();
		jl3 = new JLabel("ADDRESS : ");
		jl3.setHorizontalAlignment(JLabel.CENTER); 
		jtf3 = new JTextField(20);
		pg1.add(jl3);
		pg1.add(jtf3);
		jp6 = new JPanel();
		jl4 = new JLabel("PHONE : ");
		jl4.setHorizontalAlignment(JLabel.CENTER); 
		jtf4 = new JTextField(20);
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
		
		jta = new JTextArea(15, 60);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
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
	
	}
	public static void main(String[] args) {
		new Hw_0530_1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

