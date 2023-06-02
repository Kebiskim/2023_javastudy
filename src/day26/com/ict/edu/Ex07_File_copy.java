package day26.com.ict.edu;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_copy extends JFrame {
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JTextField jtf1, jtf2;
	JButton jb1;

	public Ex07_File_copy() {
		super("복사하기");
		
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jl1 = new JLabel("원본위치: ");
		jtf1 = new JTextField(15);
		jl2 = new JLabel("사본위치: ");
		jtf2 = new JTextField(15);
		jp1.add(jl1);
		jp1.add(jtf1);
		
		jp2 = new JPanel();
		jb1 = new JButton("복사하기");
		jp2.add(jl2);
		jp2.add(jtf2);
		jp2.add(jb1);
		
		setLayout(new GridLayout(2,1));
		add(jp1);
		add(jp2);

		pack();
		setLocale(null);		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jtf1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((JFrame)getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf1.setText(msg);
				}
			}
		});
		
		jtf2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((JFrame)getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldPathName = jtf1.getText().trim();
				String newPathName = jtf2.getText().trim();
				
				// 파일은 무조건 바이트 스트림 처리 하자.
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				try {
					fis = new FileInputStream(oldPathName);
					bis = new BufferedInputStream(fis);
					fos = new FileOutputStream(newPathName);
					bos = new BufferedOutputStream(fos);
					
					int b = 0;
					while((b = bis.read()) != -1) {
						bos.write(b);
					}
					bos.flush();
					jtf1.setText("");
					jtf2.setText("");
					
				} catch (Exception e2) {
				} finally {
					try {
						bos.close();
						fos.close();
						bis.close();
						fis.close();
					} catch (Exception e3) {
					}
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex07_File_copy();
	}
}
