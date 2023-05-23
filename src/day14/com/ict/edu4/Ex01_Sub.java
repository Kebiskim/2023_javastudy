package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.4;
	
	// this() : 자기자신의 생성자를 뜻한다.
	//			생성자의 첫번째 줄에 있어야 다른 생성자를 호출.
//	public Ex01_Sub() {
//		// 자기자신의 생성자를 뜻함. 
//		this("홍두깨", 14);
//		// this 때문에 아래로 가서 실행함.
//	}
	
	// super() : 부모클래스의 생성자를 뜻한다.
	// ★ 자식클래스 생성자 첫줄에 부모클래스 생성자가 숨어있다. (항상 이를 생각하고 만들어야 함!!!)
	public Ex01_Sub() {
		// super(); 가 숨어있는 격.
		// super도, this() 도 첫째줄에 써야하기 때문에, 위에 코드랑 같이는 못 씀!!
//		super("서울 마포구");
		this("kkk", 14);	// this를 먼저 쓰고 싶다 => 이렇게 쓰면, 아래에서 super를 해줌.
	}
	
	public Ex01_Sub(String name, int age) {
		// super(); 가 숨어있는 격.
		super("서울 마포구");
		this.name = name;
		this.age = age;
	}

	// 부모생성자에 기본생성자가 아닌 다른 것이 있으면 그 생성자를 만들어줘야 오류 안남!!
	
	// 제1원칙 객체를 생성할 때는 생성자를 호출한다.
	// 생성자가 없으면 기본호출자를, 생성자가 있으면 그 생성자를 호출해야 한다.
	
	// 자식을 호출하면 자식보다 부모가 먼저 만들어진다!!
	
}
