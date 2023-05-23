package day11.com.ict.edu;

// 연습문제에 추가로, 나이, 생존여부, 이름을 변경할 수도 있어야 함!
// 아무것도 모르는 상황에서 하는 것. (메서드를 6개 만들어야 함)

public class Ex05_Animal {
	// 생존여부 
	boolean live;
	// 나이
	int age;
	// 이름
	String name;
	
	
	boolean liveOrNot;
	// 생존여부를 변경하는 메서드
	public boolean changeLive(boolean k1) {
		if (k1 == true)
			liveOrNot = true;
		else
			liveOrNot = false;
		return liveOrNot;
	}
	
	// 생존 여부를 반환하는 메서드
	public void getLive() {
		live = true;
		System.out.println(live);
//		System.out.println("생존여부" + live);
	}
	
	// 나이를 변경하는 메서드
	public int changeAge(int k1) {
		age = k1;
		return age;
	}
	
	// 나이를 반환하는 메서드
	public void getAge() {
		age = 3;
		System.out.println(age);
//		System.out.println("나이" + age);
	}
	
	// 이름을 변경하는 메서드
	public String changeName(String k1) {
		name = k1;
		return name;
	}
	
	// 이름을 반환하는 메서드
	public void getName() {
		name = "큰뿔소";
		System.out.println(name);
//		System.out.println("이름" + name);
	}
	
}
