package day15.com.ict.edu;

public class Cat extends Animal {
	String color = "삼색이";
	
	public void play() {
		System.out.println("창밖을 바라본다.");
	}
	
	// 오버라이딩!!
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
//	@Override
//	public void sleep() {
//		System.out.println("무조건 12시간 이상 자야 함.");
//	}
}