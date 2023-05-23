package day13.com.ict.edu;

public class Ex01_Constructor {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	// 		  지역변수와 전역변수 이름이 같을 때 전역변수 앞에 this를 붙인다.
	// p1 입장에서는, (클래스 안에서는) 지역변수가 아직 만들어져있지 않음 => 호출을 못함.

	// this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	// 
	private String name = "홍길동";
	private int age = 34;
	
	public Ex01_Constructor() {
//		this(); // 인자가 없는 생성자가 인자가 없는 것을 호출하려고 하니 에러가 남.
		// 생성자가 다른 생성자 호출 (반드시 첫번째 줄에서)
		this("임꺽정"); // => 오류 사라짐!! 
		// ★ 생성자가 다른 생성자를 호출할 때는 반드시 첫번째 줄에 있어야 한다!! 그래서 위 줄을 내리면 오류남!!
		// 위 줄 안의 내용이 아래의 public Ex01_Constructor(String name) 으로 감!!
		// 이로 인해서 name 이 this.name (임꺽정)으로 바뀜!!
		System.out.println("기본생성자 : " + this);
		// 생성자에서 메서드를 호출
		prn();
		this.prn();
	}
	
	// 생성자 오버로딩 => 같은 이름의 생성자가 2개 이상 있음)
	public Ex01_Constructor(String name) {
		this.name = name; // 네임세터랑 똑같이 입력했음.
		// 이름 변경은, setter를 이용해서 할 수도, 생성자를 이용해서 할 수도 있다.
	}
	
	// 생성자 만들어져있을 때, ctrl + space 해도 생성자 다시 안 나옴.
	// 앞에 나오는 것 동그라미 안에 C는 (클래스임). Constructor는 동그라미 밖에 C, Constructor 라고 써있음. 
	
	public String getName() {
		return this.name;
	}
	// 지역변수는 메서드를 "호출" 해야 생겨난다.
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// ☆ this를 붙이면 무조건 전역변수가 됨! (지역변수는 안 보이기 때문에)
	// this는 자기자신(의 주소)을 뜻하고, this()는 this가 가지고 있는 생성자를 뜻함!!
	// 내부에서 내부생성자를 호출할 때는 this()를 씀!!
	// super => 부모라는 뜻, super()는, 부모 생성자란 뜻!!
	// p1은 외부에서 (사람이) 클래스에 접근할 때 쓰는 주소. 클래스(자기자신) 내부에서 변수들을 지칭하기 위해서 
	// 쓰는 것 => this
	
	public void prn() {
		
	}
	
}
