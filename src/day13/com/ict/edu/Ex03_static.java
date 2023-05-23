package day13.com.ict.edu;

public class Ex03_static {
	// static 초기화
	// static{
	//		  초기화 내용
	// }
	
	int s1 = 100;
	private int p1 = 300;
	static int s2;
	
	public static int k1 = 300;
	static int k2 = 100;
	private static int k3 = 100; 
	
	
	static {
		m1 = 1000;	// 선언보다 위에 있는데도 오류가 안남!!
		s2 = 1000;
		k2 = 1000;
		m2 = 1000;  // 이 경우에는 m2 => 500으로 나옴
		// 값이 없는 경우에는 (밑에 선언된 m1의 경우) 값을 ★알아서★ 넣어줌.
		// 값이 있는 경우에는, 밑에 있는 것으로 값이 바뀜.
	}
	
	// 생성자 : 인스턴스 초기화가 목적
	// 여기 있든 바로 위 아래로 가든 결과값에 변화 X
	public Ex03_static() {
		s1 = 200;
		s2 = 400;
		s3 = 500;	// 선언보다 위에 있는데도 오류 안남!!
	}
	int s3;
	static int m1;
	static int m2 = 500;
	
}
