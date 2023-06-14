package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer implements Runnable {
	ServerSocket ss = null;
	Socket s = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 ... ");
			
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				
				// BufferedWriter 사용 시 System.lineSeparator() 사용해야 한다. (안하면 늦게 날라가는 문제)
				// readLine으로 읽어오는 줄의 끝부분을 처리해준다 (개행문자의 개념)
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
				
			} catch (Exception e) {
			} finally {
				try {
					s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
				} catch (Exception e2) {

				}
			}
		}
	}
	public static void main(String[] args) {
		new EchoServer();
	}
}
