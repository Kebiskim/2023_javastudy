package day16.com.ict.edu;

public class Ex01_enum {
	// 열거형 (enum) : 상수를 하나의 객체로 인식하고, 여러 개의 상수 객체들을 한곳에
	//				  모아둔 하나의 묶음
	
	int su = 12;
	static final int JAVA = 200;
	static final int HTML = 300;
	
	public void play() {
		// 지역변수는 static을 사용할 수 없다.
		// 지역변수는 메서드를 호출해야 만들어지는데, 그 지역변수에 static을 붙이면 미리 만들어진단 뜻.
		// → 말이 안되기 때문에, 지역변수는 static 붙일 수 없음
//		static final int CSS = 500;
	}

	// 열거형
	public enum Lesson{
		JAVA, JSP, SRING, ANDROID, HTML
	}
	
	public static void main(String[] args) {
		int num = 100;
		// 하단 오류 => 지역변수에서는 static 사용할 수 없음.
//		static final int JSP = 400;
		// ststic 메서드에서는 전역변수를 쓸 수 없음(하단)
//		System.out.println(su);
		System.out.println(num);
		
		// JAVA, HTML이 각각 가진 값이 출력됨.
		System.out.println(JAVA);
		System.out.println(HTML);
		
		// 열거형 안에 있는 JAVA 추출
		// 열거형 안에 있는 JAVA와 밖이 서로 다름.
		System.out.println();
		Lesson s1 = Lesson.JAVA;
		System.out.println(s1);
		
		// 한번에 다 추출
		Lesson[] items = Lesson.values();
		for (int i = 0; i < items.length; i++) {
			// ordinal => 배열의 index 값
			System.out.println(items[i] + ":" + items[i].ordinal());
		}
	}
}
