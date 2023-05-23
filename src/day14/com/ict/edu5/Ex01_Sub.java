package day14.com.ict.edu5;

public class Ex01_Sub extends Ex01_Super {
	int weight = 35;
	
	@Override
	public void sound() {
		System.out.println("음악소리");
	}
	// 부모 인자를 그대로 가져오고, 안에 내용물만 바꿈. => 그럼 부모꺼가 안 나옴. 
	// 이를 정보 은닉이라고 부름 (객체의 특성 중 하나!!) => 부모꺼를 숨겨버린 것
	// 부모 메서드를 가지고 와서, 맘대로 내용만 바꿔서 써버린 것!!
	
	public void hobby() {
		System.out.println("잠자기");
	}
}