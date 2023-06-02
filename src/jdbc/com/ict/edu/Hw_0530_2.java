package jdbc.com.ict.edu;

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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class Hw_0530_2  extends JFrame {
	// 컴포넌트 선언부
	JPanel topPanel, leftPanel, rightPanel, bottomPanel, leftPanel2, leftPanel3, leftPanel4;
	JLabel jl1;
	String[] label_labels= {"ID: ","이름: ","전화: ","주소: ","회사: ", "", "", "", "", ""};
	String[][] contents = {
						  {"111", "김상우", "010-2212-2133", "부산시 금정구", "ICT인재"}
						  };
	JTextField jtf1;
	private JTextField []fields=new JTextField[10];
	JTable table;
	String[] table_header= {"ID","Name","Phone","Address","Company"};
	JScrollPane scrolledTable;
	String[] button_labels = {"추가", "삭제", "수정", "", "", "검색", "지우기", "전체보기"};	
	String[] items = {"이름", "아이디", "전화번호", "주소", "회사명"};
	JComboBox<String> jcb = new JComboBox<>(items);

	public Hw_0530_2() {
		super("");
		
		topPanel = new JPanel();
		jl1 = new JLabel("ADDRESS BOOK");
		topPanel.add(jl1);
		
		leftPanel3 = new JPanel(new GridLayout(7, 2));
		for(int i=0;i<5;i++) {
			leftPanel3.add(new JLabel(label_labels[i]));
			fields[i]=new JTextField(15);
			leftPanel3.add(fields[i]);
		}
	
		rightPanel = new JPanel();
		DefaultTableModel model=new DefaultTableModel(table_header,0);	//header추가, 행은 0개 지정
//			table=new JTable(model);
		table=new JTable(contents,table_header);
//			table.sethori (SwingConstants.CENTER);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrolledTable = new JScrollPane(table);	//스크롤 될 수 있도록 JScrollPane 적용
		scrolledTable.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));	//너무 붙어있어서 가장자리 띄움(padding)
		rightPanel.add(scrolledTable);
		
		bottomPanel = new JPanel();
		for(int i=0;i<8;i++) {
			if (i == 3) {
				bottomPanel.add(new JComboBox<>(items));
			}else if (i == 4) {
				jtf1 = new JTextField(15);
				bottomPanel.add(jtf1);
			}else {
			bottomPanel.add(new JButton(button_labels[i]));
			}
		}
		
		leftPanel = new JPanel(new BorderLayout());
		leftPanel2 = new JPanel();
		leftPanel4 = new JPanel();
		leftPanel.add(leftPanel2, BorderLayout.NORTH);
		leftPanel.add(leftPanel3, BorderLayout.CENTER);
		leftPanel.add(leftPanel4, BorderLayout.SOUTH);
		
		add(topPanel, BorderLayout.NORTH);
		add(leftPanel, BorderLayout.WEST);
		add(rightPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		
		
//		
//		JPanel pg1 = new JPanel();
//		JPanel pg2 = new JPanel();
//		pg1.setLayout(new BorderLayout());
//		pg2.setLayout(new BorderLayout());
//		
//		pg1.add(jp1, BorderLayout.NORTH);
//		pg1.add(jp2, BorderLayout.CENTER);
//		
//		pg2.add(jp3, BorderLayout.NORTH);
//		pg2.add(jsp, BorderLayout.CENTER);
//		pg2.add(jp4, BorderLayout.SOUTH);
//		
//		add(pg1, BorderLayout.NORTH);
//		add(pg2, BorderLayout.CENTER);
		
		
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new Hw_0530_2();
	}
}

