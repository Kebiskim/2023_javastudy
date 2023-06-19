package network.com.ict.edu9;

import java.io.Serializable;
import java.util.List;
import network.com.ict.edu10.db.VO_2;

public class Protocol implements Serializable {
	// 0: 전체보기, 1: 삽입, 2: 삭제, 3: 검색
	int cmd;
	int result;
	List<VO_2> list;
	// 프로토콜에 들어있는 VO가 정답이 아닐까?
	// public인데 왜 getter, setter 있나?
	VO_2 vo;
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public List<VO_2> getList() {
		return list;
	}
	public void setList(List<VO_2> list) {
		this.list = list;
	}
	public VO_2 getVo() {
		return vo;
	}
	public void setVo(VO_2 vo) {
		this.vo = vo;
	}
}
