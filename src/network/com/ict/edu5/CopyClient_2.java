package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// extends Thread를 사용하는 경우에는
// Thread를 상속받고 객체화한 뒤에 객체명.start()를 통해 사용하고

// implements Runnable을 사용하는 경우에는
// Thread 객체 안에 쓰레드를 사용하려는 객체를 넣어줘서 객체화한 뒤 사용한다

// extends Thread 쪽이 길이가 더 짧아서 나아보일 수 있는데
// extends의 경우에는 하나밖에 상속을 받지 못하는 만큼
// 클래스명 extends A,B 이렇게 사용을 못한다

// 반면 implements는 implements a,b 가 가능하기 때문에
// 뭔가 상속받아야 할 게 있다면 implements Runnable을 사용하면 되고
// 딱히 상속받을게 없다면 extends Thread를 사용해주면 된다
public class CopyClient_2 extends Thread {
	Socket s;
	ChatServer_2 server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	public CopyClient_2(Socket s, ChatServer_2 server) {
		this.s = s;
		this.server = server;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {

		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				if(msg.equals("exit")) {
					// 원격에 있는 실제 클라이언트에게 종료 메시지 보냄
					out.println("bye");
					break;
				}
				server.sendMsg(ip + ":" + msg);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} // 무한반복
		try {
			out.close();
			in.close();
			s.close();
			// server에 있는 list에서 현재 객체 삭제
			server.removeClient(this);
			server.sendMsg(ip + "님 퇴장");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
