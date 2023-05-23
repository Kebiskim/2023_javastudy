package day12.com.ict.edu;

public class Ex02_get_set {
	
	// 직접 접근을 막기 위해서 접근제한자(private)를 사용한다.
	private String name = "홍길동";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender = true;
	// 필요에 의해서 뒤에 추가한 상황 (위에 줄) => 있는 것들은 빼고 추가할 수 있도록 중복 없이 표시됨!!
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	// API에서 is 변수이름 => getter 기능을 함!! (boolean형만 get 대신 is라고 붙음!!) 
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		// name = name => 으로 하면, 지역변수에서 지역변수로 넘기는 것이므로, 오류가 남
		// 그렇기 때문에 전역변수 앞에 this.를 붙여줘야 함!!
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// get()/set()를 이용
	// 상단 메뉴에서 source => Generate Getters and Setters 누르기 (커서 위치에서 놓아짐)
	// 가진 변수들(전역 변수들)이 나오는데, 선택해서 확인누르면 됨. getter 혹은 setter 둘중에 하나만 만들
	// 수도 있지만, 그럴 필요는 없음.
	// Select all 눌러서 보면 위에 public 들이 나옴!
	// Spring 배웠을 때 론북? 처리 해주면 setter, getter 없이도 알아서 가져올 수 있도록 처리해 줌!
	
	// ★ 지역변수와 전역변수의 이름이 같을 때, 오류가 아님! ☆ 전역변수에 무조건 this를 붙여야 함!!
	// 지역, 전역변수가 있을 때, 지역변수가 우선순위가 높음!! 지역변수, 전역변수, 부모클래스 순으로 우선순위가 진행!!
	// 지역변수에 없으면, 전역변수로 감. 전역변수에도 없으면, 부모클래스로 감!!
	
}
