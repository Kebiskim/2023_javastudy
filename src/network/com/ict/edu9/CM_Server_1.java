package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import javax.swing.JOptionPane;

import network.com.ict.edu8.VO;

public class CM_Server_1 implements Runnable {
	ServerSocket ss;
	List<Protocol> list = null;	
	ObjectOutputStream out;
	ObjectInputStream in;
	CM_Client_2 client = new CM_Client_2();
	
	public CM_Server_1() {
		try {
			ss = new ServerSocket(7781);
			System.out.println("서버 대기중 ... ");
			new Thread(this).start();
		} catch (Exception e) {

		}
	
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				Socket s = ss.accept();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 0:
						
						break esc;
					case 1:

						break;
					case 2:
						break;
					case 3:
						break;
					}
				}
			} catch (Exception e) {

			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
