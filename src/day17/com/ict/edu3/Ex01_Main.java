package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex01_Main extends JFrame {
	public Ex01_Main() {
		super("JTable");
		// 패널에 넣을 수 없음. 프레임에 바로 넣자!!
		
		Ex01_JTable table = new Ex01_JTable();		
		JTable jTable = new JTable(table);
		JScrollPane jsp = new JScrollPane();
		JPanel jp = new JPanel();

//		jp.add(jTable);
		jp.add(jsp);
		add(jp);
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ex01_Main();
	}
}
