package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// 여기는 스레드처리 안하네?
public class ChatServer_2 {
	ServerSocket ss = null;
	// 자료형이 CopyClient
	ArrayList<CopyClient_2> list = null;
	
	public ChatServer_2() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 시작!");
			exe();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 서버 실행부를 메서드로 따로 뺐음.
	public void exe() {
		while(true) {
			try {
				Socket s = ss.accept();
//				public CopyClient_2(Socket s, ChatServer_2 server) {
//					this.s = s;
//					this.server = server;
//					try {
//						in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//						out = new PrintWriter(s.getOutputStream(), true);
//						ip = s.getInetAddress().getHostAddress();
//					} catch (Exception e) {
//
//					}
//				}
				CopyClient_2 cc = new CopyClient_2(s, this);
				// 스레드 처리가 여기서 가능하다!! (상속받은 클래스 초기화했음)
				cc.start();
				list.add(cc);
				sendMsg(" ** " + cc.ip + " 님 입장 ** ");
//				sendMsg(" ** " + cc.ip + " 님 입장 ** ");				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void sendMsg(String msg) {
		// 리스트 안에 있는 모든 client에게, 받은 메세지를 보내자.
		for (CopyClient_2 k : list) {
			k.out.println(msg);
		}
	}
	
	public void removeClient(CopyClient_2 cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new ChatServer_2();
	}
}
