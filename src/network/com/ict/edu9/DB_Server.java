package network.com.ict.edu9;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DB_Server implements Runnable {
	ServerSocket ss;
	Socket s = null;
	public DB_Server() {
		try {
			ss = new ServerSocket(7782);
			System.out.println("서버 대기중 ... ");
			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		esc: while(true) {
			try {
				s = ss.accept();
				CP_Client cc = new CP_Client(s, this);
				cc.start();
			} catch (Exception e) {

			}
		}
		
	}
	public static void main(String[] args) {
		new DB_Server();
	}
}
