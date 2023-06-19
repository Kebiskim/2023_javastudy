package network.com.ict.edu8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import network.com.ict.edu10.db.DAO_2;
import network.com.ict.edu10.db.VO_2;

public class CP_Client extends Thread {
	Socket s;
	CM_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String ip;
	public CP_Client(Socket s, CM_Server server) {
		//CM_Server 를 받아와서 CP_Client 쪽에 저장
		this.s = s;
		this.server = server;
		try {
			// 직렬화(스트림에 객체를 출력)에는 ObjectInputStream을 사용하고,
			// 역직렬화(스트림으로부터 객체를 입력)에는 ObjectOutputStream을 사용한다.
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					VO vo = (VO)obj;
					// cmd 가 각 case일 때, copyclient에서 할 행동들 지정
					switch (vo.getCmd()) {
					case 0: // 종료
						out.writeObject(vo);
						out.flush();
						break esc;
					case 1: // 채팅
						vo.setMsg(ip + ":" + vo.getMsg());
						server.sendMsg(vo);
						break;
					case 2: // 그림그리기
						server.picture(vo);
						break;
					}
				}
			} catch (Exception e) {
				
			}
		} // 무한반복
		  // 현재 객체를 삭제
		server.removeClient(this);
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {

		}
	}
}
