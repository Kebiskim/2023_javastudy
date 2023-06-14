package network.com.ict.edu6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public CopyClient(Socket s, ChatServer server) {
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
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 0: // 접속 종료
						out.writeObject(p);
						break esc;
					case 1: // 닉네임 받기
						nickName = p.getMsg();
						// 다른 사람 입장에서는 메시지가 가는 것이므로, Cmd를 2로 설정	
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
		} // 무한 반복 끝
		try {
			out.close();
			in.close();
			s.close();
			
			server.removeClient(this);
			Protocol p2 = new Protocol();
			p2.setCmd(2);
			p2.setMsg(nickName + "님 퇴장");
			// ★ Protocol이라는 객체를 만들어서 내용을 한번에 다 넣어서 보낸다!
			server.sendMsg(p2);
		} catch (Exception e) {

		}
	}
}