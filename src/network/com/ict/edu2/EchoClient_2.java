package network.com.ict.edu2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient_2 {
	public static void main(String[] args) {
		// 클라이언트 측에서는 ServerSocket 불필요.
		Socket s = null;
		OutputStream out = null;
		InputStream in = null;
		try {
			// 클라이언트의 ip주소와 서버의 port number 입력
			s = new Socket("192.168.25.2", 7777);
			System.out.println("클라이언트 연결 성공");
			
			// 입출력 스트림
			out = s.getOutputStream();
			in = s.getInputStream();
			
			// 메세지 전송
			String msg = "안녕";
			out.write(msg.getBytes());
			out.flush();
			
			// 서버에서 전송된 데이터 수신
			byte[] buff = new byte[100];
			in.read(buff);
			String receive_msg = new String(buff).trim();
			System.out.println("에코메시지 : " + receive_msg);
		} catch (Exception e) {

		} finally {
			try {
				
			} catch (Exception e2) {
				try {
					in.close();
					out.close();
					s.close();					
				} catch (Exception e3) {

				}
			}
		}
	}
}
