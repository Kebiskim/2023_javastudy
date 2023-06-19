package network.com.ict.edu7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient_2 extends Thread {
	Socket s;
	ChatServer_2 server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	// 현재 client가 참여하고 있는 방 정보
	ChatRoom_2 c_room = null; // null 이면 어떤 방에도 참여하고 있지 않은 상태
	
	public CopyClient_2(Socket s, ChatServer_2 server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				// inputStream으로 들어온 정보를 읽어서, 있다면 프로토콜 생성
				// 어떤 정보가 들어오는가?
				if(obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0:	// 종료
						// 현재 방에 참여하고 있는 상태인지 확인 (null 아니면 참여하고 있음)
						if(c_room != null) {
							outRoom();
						}
						// OutputStream에 오브젝트를 쓰기
						out.writeObject(p);
						break esc;
					case 1: // 메시지
						p.setMsg(nickName + ":" + p.getMsg());
						c_room.sendProtocol(p);
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
