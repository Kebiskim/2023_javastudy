package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer_2 implements Runnable {
	ServerSocket ss = null;
	Socket s = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	public EchoServer_2() {
		try {
			// 서버소켓 만들기
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 ...");
			
			// 스레드 시작
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				// InputStream 은 바이트 단위로 데이터를 처리한다. 
				// 또한 System.in 의 타입도 InputStream 이다. 
				// InputStreamReader 은 문자(character) 단위로 데이터를 
				// 처리할 수 있도록 돕는다.
				
				// inputStreamReader는 byte 대신 char 형태로 읽을 수 있다. 
				// 따라서 아스키코드가 아닌 문자열로 출력이 가능하며, String 객체로 
				// 변환할 수도 있게 된다. inputStream을 인자값으로 받아와서 만들어진다.
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				
				// BufferedWriter 사용 시, System.lineSeparator() 사용해야 한다.
				// readLine으로 읽어오는 줄의 끝부분을 처리해준다 (개행문자의 개념)
				msg += System.lineSeparator();
				bw.write(msg);
				// BufferedWriter write 다음에 flush 
				bw.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer_2();
	}
}	
