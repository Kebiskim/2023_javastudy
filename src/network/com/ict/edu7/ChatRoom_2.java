package network.com.ict.edu7;

import java.util.ArrayList;

public class ChatRoom_2 {
	// 방 참여자들이 저장되어 있는 곳 - 방 나가기 또는 접속 해제 시 여기서 삭제되어야 한다.
	// 							마지막 사람이 나가면 방을 삭제하자.
	ArrayList<CopyClient_2> j_list; // 방 참여자들 리스트?
	String title; // 방 제목
	
	// 방 제목 받아옴.
	public ChatRoom_2(String title) {
		j_list = new ArrayList<>();
		this.title = title;
	}
	
	// 방 제목을 반환하는 기능(ChatServer_2에서 호출)
	public String getTitle() {
		return title;
	}
	
	// 현재 방의 참여자수를 반환 - 방 나갈때 마지막 사람일 경우 방을 삭제
	public int getJoinCount() {
		return j_list.size();
	}
	
	// 방 참여
	public void join(CopyClient_2 cc) {
		j_list.add(cc);
		
		// 방 참여자에게만 메시지 전달 (대기실에 있는 사람 빼고)
		Protocol_2 p = new Protocol_2();
		p.setCmd(4);
		p.setMsg(" ** " + cc.nickName + "님 입장 ** ");
		p.setNames(getJoinUsers());
		
		sendProtocol(p);
	}
	
	// 방 참여 명단 반환 (방 나가기 하면 명단 갱신 필요)
	public String[] getJoinUsers() {
		String[] arr = new String[j_list.size()];
		int i = 0;
		for (CopyClient_2 k : j_list) {
			try {
				k.out.writeObject(p);
				k.out.flush();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	// 방 나가기
	public void getOut(CopyClient_2 cc) {
		j_list.remove(cc);
	}
}
