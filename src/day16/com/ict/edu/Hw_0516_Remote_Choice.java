package day16.com.ict.edu;

public class Hw_0516_Remote_Choice {
	
	private int tv = 1;
	private int com = 2;
	private int ear = 3;
	private int vol = 0;

	public void chooseMachine(int su, int vol){
		switch(su) {
	    case 1 : System.out.println("TV 볼륨을 설정합니다.");
	             System.out.println("현재 볼륨은" + vol + " 입니다."); break;
	    case 2: System.out.println("컴퓨터 스피커 볼륨을 설정합니다.");
	    System.out.println("현재 볼륨은 " + vol + " 입니다."); break; 
	    case 3: System.out.println("이어폰 볼륨을 설정합니다.");
	    System.out.println("현재 볼륨은 " + vol + " 입니다."); break;
	    default : System.out.println("다시 입력하세요"); break;
	    }
	}
	
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}


	public int getTv() {
		return tv;
	}

	public void setTv(int tv) {
		this.tv = tv;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getEar() {
		return ear;
	}

	public void setEar(int ear) {
		this.ear = ear;
	}
}
	
