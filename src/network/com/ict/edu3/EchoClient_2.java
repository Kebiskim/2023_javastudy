package network.com.ict.edu3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient_2 {
	public static void main(String[] args) {
		Socket s = null;
		OutputStream out = null;
		InputStream in = null;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("클라이언트 연결 성공");
			
			// 메세지 전송
			while (true) {
				scan = new Scanner(System.in);
				// 입출력 스트림
				s = new Socket("192.168.0.69", 7777);
				
				out = s.getOutputStream();
				in = s.getInputStream();
				System.out.println("메시지를 입력하세요");
				String msg = "";
				msg = scan.next();
				out.write(msg.getBytes());
				out.flush();
				
				// 서버에서 전송된 데이터 수신
				byte[] buff = new byte[100];
				in.read(buff);
				String receive_msg = new String(buff).trim();
				
				System.out.println("에코메세지 : " + receive_msg);
			}
			
			
		} catch (Exception e) {

		} finally {
			try {
				s.close();
				in.close();
				out.close();
			} catch (Exception e2) {

			}
		}
	}
}
