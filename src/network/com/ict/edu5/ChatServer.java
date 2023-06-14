package network.com.ict.edu5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	ServerSocket ss = null;
	// 자료형이 copyClient
	ArrayList<CopyClient> list = null;
	
	public ChatServer() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 시작!");
			exe();
		} catch (Exception e) {
		}
	}
	public void exe() {
		while(true) {
			try {
				// 접속자가 올 때까지 기다리는 것 (접속자 정보는 s가 가지고 있음)
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				// 스레드처리가 된다는 것 (start())
				cc.start();
				list.add(cc);
				sendMsg(" ** " + cc.ip + " 님 입장 ** ");
				sendMsg(" ** " + "ㅇㅇ" + " 님 입장 ** ");
			} catch (Exception e) {
			}
		}
	}
	
	public void sendMsg(String msg) {
		// 리스트 안에 있는 모든 client에게 받은 메세지를 보내자.
		for (CopyClient k : list) {
			k.out.println(msg);
		}
	}
	
	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}