package network.com.ict.edu6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient_2 extends Thread {
	Socket s;
	ChatServer_2 server;
	// 객체 직렬화
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public CopyClient_2(Socket s, ChatServer_2 server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {

		}
	}
	
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					// 위에서 프로토콜 생성 (switch문 밖에서)
					Protocol_2 p = new Protocol_2();
					switch (p.getCmd()) {
					case 0: // 접속 종료
						// 종료 시에 writeObject를 하는 이유?
						out.writeObject(p);
						break esc;
					case 1: // 닉네임 받기
						// ChatClient에서 Protocol 생성해서 setMsg에 name(닉네임)을 보냈음!
						nickName = p.getMsg();
						// 다른 사람 입장에서는 메세지가 가는 것, Cmd는 2 
						p.setCmd(2);
						p.setMsg(nickName + "님 입장");
						// 접속자 모두에게 전달
						server.sendMsg(p);
						break;
					case 2: // 메세지 일반채팅
						p.setCmd(2);
						p.setMsg(nickName + ":" + p.getMsg());
						server.sendMsg(p);
						break;
					}
				}
			} catch (Exception e) {

			}
		} // while 문의 끝 
		try {
			out.close();
			in.close();
			s.close();
			
			server.removeClient(this);
			Protocol_2 p2 = new Protocol_2();
			p2.setCmd(2);
			p2.setMsg(nickName + "님 퇴장");
			// ★ Protocol이라는 객체를 만들어서 내용을 한번에 다 넣어서 보낸다!
			// 서버의 sendMsg 메서드의 매개변수로 Protocol을 보내버림! 
			// 그렇다면, DAO에서 자료를 받아서 작업하는 것이 맞는가?
			server.sendMsg(p2);
		} catch (Exception e) {
			
		}
	}
}
