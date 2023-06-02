package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_Open extends JFrame implements ActionListener{
	JPanel jp;
	JTextArea jta;
	JButton jb1;
	JTextField jtf;
	JLabel jl;
	public Ex05_File_Open() {
		super("불러오기");
		
		jp = new JPanel();
		jl = new JLabel("파일경로 : ");
		jtf = new JTextField(20);
		jb1 = new JButton("열기");
		jta = new JTextArea(20,0);
		jta.setLineWrap(true); // 자동 줄바꾸기
		jta.setEditable(false);
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
				f_open();
		    }		
		});
		jtf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((JFrame)getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				// 취소 눌렀을 때 nullnull 표시하는 대신 아무반응 안 하게!!
				if (! msg.equals("nullnull")){
					jtf.setText(msg);
					f_open();
				}
			}
		});
	}
	private void f_open() {
		String pathname = jtf.getText().trim();
		if(pathname.length() > 0) {
			File file = new File(pathname);
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				
				byte[] b = new byte[(int) file.length()];
				bis.read(b);
				// trim으로 혹시 있을지 모를 앞뒤 공백 제거
				String msg = new String(b).trim();
				// append는 계속 추가되지만, setText는 앞의 내용 지워짐.
				jta.setText(msg);
				
			} catch (Exception e) {
				
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex05_File_Open();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
