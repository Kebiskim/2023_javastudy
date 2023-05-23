package day12.com.ict.edu;

public class Ex05_Constructor {
	// 생성자 : 클래스를 객체로 만들때 한번 호출된다.
	// 생성자 목적 : 멤버필드(변수와 상수)의 초기값 지정
	//      특징 : 생성자이름은 클래스 이름이다.
	//			  반환형이 없는 메서드와 같다.
	//			  [접근제한자] 생성자이름([인자]...) { 실행 내용 }
	//			  하나의 클래스에 여러개의 생성자를 가질 수 있다. (생성자 오버로딩)
	//			  생성자가 없으면 객체 생성할 때 기본 생성자를 호출한다.
	//			  기본생성자란 인자가 없는 생성자를 말한다.
	
	private String name = "홍길동";
	private int age = 24;
	private String addr = "충청도";
	
	// 기본생성자
	public Ex05_Constructor() {
		name = "일지매";
		age = 29;
		addr = "전라도";
	}

	// 새로 만든 생성자. 생성자 오버로딩
	public Ex05_Constructor(String name) {
		this.name = name; // this 붙여서 전역변수로 변경해주지 않으면, 이름이 지역변수로만 들어가서 안 바뀜.	
	}
	// 위 두개 주석처리 하면서 main 메서드에서 각각 오류나는지 체크!
	
	// Source - Generate Constructor using Fields => 멤버 이용해서 만든다. (필드 - 변수와 상수 를 이용하여 생성자 만듬)
	// Source - Generate Constructor using Superclass => 상속
	public Ex05_Constructor(String name, int age) {
//		super(); // 상속 => 아직 안배워서 지우는 것.
		this.name = name;
		this.age = age;
	}
	
	public Ex05_Constructor(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
