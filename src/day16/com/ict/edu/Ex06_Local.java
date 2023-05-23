package day16.com.ict.edu;


// Local 내부클래스
public class Ex06_Local {
	String name = "둘리";
	public Ex06_Local() {
		System.out.println("외부생성자 : " + this);
	}
	public void sound() {
		String str = "호이~ 호이!";
		System.out.println(str);
	}
	public void play() {
		int age = 24;
		// 내부클래스는 static 못 씀
//		static int eyes = 2;
		
		// 내부클래스
		class Dog{
			String addr = "서울 용산구";
			public Dog() {
				System.out.println("내부생성자 : " + this);
			}
			public void prn() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(addr);
//				System.out.println(str);
			} // 내부클래스 메서드의 끝
		} // 내부클래스 끝
		Dog dog = new Dog();
		dog.prn();
		// ☆ 외부클래스 끝에는 못 들어감!! 메서드 끝나기 전에 하고싶은 것 다 해야 함!!
	} //외부클래스 멤버메서드 끝
	// 위 내용 중요함.
	
}
