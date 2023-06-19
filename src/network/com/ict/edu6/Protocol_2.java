package network.com.ict.edu6;

import java.io.Serializable;

// 객체 직렬화
public class Protocol_2 implements Serializable {
	// cmd => 0: 접속종료, 1: 닉네임 받기, 2: 메시지
	// msg => 내용
	int cmd;
	String msg;
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
