package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract {

	String name = "개똥이";
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	@Override
	public void play() {
		System.out.println("들에서 놀기");
	}
	
	// 선언을 부모로 했으면, 자식만 가지고 있는 메서드는 사용 불가.
	// 부모클래스를 선언했으므로 자식클래스만 가진 메서드는 사용 못함.
	public String getName() {
		return name;
	}
	
}
