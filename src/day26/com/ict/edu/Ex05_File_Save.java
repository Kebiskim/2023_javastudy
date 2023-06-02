package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_Save extends JFrame implements ActionListener{
	JPanel jp;
	JTextArea jta;
	JButton jb1;
	JTextField jtf;
	JLabel jl;
	public Ex05_File_Save() {
		super("저장하기");
		
		jp = new JPanel();
		jl = new JLabel("파일경로 : ");
		jtf = new JTextField(20);
		jb1 = new JButton("저장");
		jta = new JTextArea(20,0);
		jta.setLineWrap(true); // 자동 줄바꾸기
//		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp.add(jl);
		jp.add(jtf);
		jp.add(jb1);
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(400,600);
		setLocale(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f_save();
			}
		});
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		// 열기창 띄우기
		jtf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((JFrame)getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				// 취소 눌렀을 때 nullnull 표시하는 대신 아무반응 안 하게!!
				if (! msg.equals("nullnull")){
					jtf.setText(msg);
				}
			}
		});

	}
	private void f_save() {
		String pathname = jtf.getText().trim();
		if(pathname.length() > 0) {
			File file = new File(pathname);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			try {
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);
				
				String msg = jta.getText().trim();
				bos.write(msg.getBytes());
				bos.flush();
			} catch (Exception e) {
			} finally {
				try {
					bos.close();
					fos.close();
				} catch (Exception e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex05_File_Save();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
