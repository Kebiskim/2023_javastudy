package Bj_Prac;

public class Main_2 {
	public static void main(String[] args) {
		
		ClassName_2<String, Integer> a = new ClassName_2<String, Integer>();
		
		a.set("10", 10);
		
		System.out.println("first data : " + a.getFirst());
		// 반환된 변수의 타입 출력
		System.out.println("K Type : " + a.getFirst().getClass().getName());
		
		System.out.println("second data : " + a.getSecond());
		// 반환된 변수의 타입 출력
		System.out.println("V Type : " + a.getSecond().getClass().getName());
	}
}
