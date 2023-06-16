package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import network.com.ict.edu10.db.VO_2;
import network.com.ict.edu10.db.DAO_2;

public class CP_Client extends Thread {
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	VO_2 vo = new VO_2();
	public CP_Client(Socket s, DB_Server server) {
		this.s = s;
		this.server = server;
		try {
			// 객체 직렬화, 역 직렬화.
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {

		}
	}
	
	@Override
	public void run() {
		esc: while(true) {
			try {
				// 직렬화 또는 역직렬화 과정에서 별도의 처리가 필요할 때는 
				// writeObject와 readObject 메서드를 클래스 내부에 선언해주면 된다
				Object obj = in.readObject();
				if(obj != null) {
					// 프로토콜을 위에서 생성
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 0:
						out.writeObject(p);
						out.flush();
						break esc;
					case 1:
						List<VO_2> list = DAO_2.getList();
						p.setList(list);
						out.writeObject(p);
						out.flush();
					case 2:
						DAO_2.getInsert(vo);
						out.writeObject(p);
						out.flush();
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {

		}

	}
}
