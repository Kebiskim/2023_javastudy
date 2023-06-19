package network.com.ict.edu7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import network.com.ict.edu6.CopyClient_2;

public class ChatServer_2 implements Runnable {
	ServerSocket ss;
	
	// 접속자(대기자)의 정보를 저장하는 곳
	ArrayList<CopyClient_2> c_list;
	
	// 대화방을 저장하는 곳
	ArrayList<ChatRoom_2> r_list;
	
	public ChatServer_2() {
		c_list = new ArrayList<>();
		r_list = new ArrayList<>();
		try {
			ss = new ServerSocket(7779);
			System.out.println("서버 대기중 ... ");
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				// 다른 client의 연결 요청 받아옴
				Socket s = ss.accept();
				CopyClient_2 cc = new CopyClient_2(s, this);
				cc.start();
				c_list.add(cc);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	// 대기실에 있는 모든 접속자에게 메시지 전달
	public void sendMsg(Protocol_2 p) {
		for (CopyClient_2 k : c_list) {
			try {
				k.out.writeObject(p);
				k.out.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	// 방 목록에 방 추가
	public void addRoom(ChatRoom_2 room) {
		r_list.add(room);
	}
	
	// index 받아서 r_list로부터 방 객체 하나를 반환
	public ChatRoom_2 getRoom(int index) {
		return r_list.get(index);
	}
	
	// 대기실에서 삭제
	public void removeClient(CopyClient_2 cc) {
		c_list.remove(cc);
		// 목록 갱신
		refresh();
	}
	
	// 대기실 목록 갱신 (방목록, 대기실 명단)
	public void refresh() {
		Protocol_2 p = new Protocol_2();
		p.setCmd(2);
		// 프로토콜에 이름 설정??
		// 서버에 메서드가 다 있었음.
		p.setNames(getUserName()); // 대기실 명단 갱신
		p.setRooms(getRoomName()); // 방 목록 갱신
		
		// 대기실 사람에게 전달
		sendMsg(p);
	}
	
	// 대기실 명단 갱신
	public String[] getUserName() {
		
	}
	
	// 방 목록 갱신
	public String[] getRoomName() {
		
	}
	
	public void addClient(CopyClient_2 cc) {
		
	}
	
	// 방 객체 삭제
	public void removeRoom(ChatRoom_2 c_room) {
		
	}
	
	public static void main(String[] args) {
		new ChatServer_2();
	}
}
