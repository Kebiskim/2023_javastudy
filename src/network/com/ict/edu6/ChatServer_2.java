package network.com.ict.edu6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer_2 {
	ServerSocket ss = null;
	ArrayList<CopyClient_2> list = null;
	
	public ChatServer_2() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7790);
			System.out.println("서버 대기중 ... ");
			exec();
		} catch (Exception e) {
			
		}
	}
	
	// 서버 실행부 => private
	private void exec() {
		while(true) {
			try {
				Socket s = ss.accept();
				CopyClient_2 cc = new CopyClient_2(s, this);
				cc.start();
				list.add(cc);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void sendMsg(Protocol_2 p) {
		try {
			for (CopyClient_2 k : list) {
				k.out.writeObject(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void removeClient(CopyClient_2 cc) {
		list.remove(cc);
	}
	
	public static void main(String[] args) {
		new ChatServer_2();
	}
}
