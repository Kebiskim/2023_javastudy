//package day16.com.ict.edu;
//
//// 일반클래스에는 static 붙이면 오류
//public static class Ex07_static {
//	String name = "홍길동";
//	private int age = 24;
//	static boolean gender = true;
//	
//	public Ex07_static() {
//		System.out.println("외부 생성자 : " + this);
//	}
//	
//	public void play() {
//		int money = 1000;
//		System.out.println("외부 메서드 : " + name);
//		System.out.println("외부 메서드 : " + money);
//	}
//	
//	// 내부클래스의 멤버변수가 static이면 class를 static으로 만들어야 함
//	// ☆ 권장 사항은 아님 (일반클래스에서는 static 사용 못함)
//	// static은 지역변수에도 못 쓰고, ★ 멤버변수와 멤버메서드에만 쓴다.
//	public static class Inner01{
//		String addr = "서울 마포구";
//		int roomNumber = 1;
//		static int count = 30;
//		
//		public Inner01() {
//			System.out.println("내부생성자 : " + this);
//		}
//		public void prn() {
//			int weight = 79;
//			System.out.println(addr);
//			System.out.println(roomNumber);
//			
//			// 외부클래스의 멤버 사용 못함!! (앞의 예시랑 다름.)
//			
//			// 외부클래스의 메서드
//			// play();
//		}
//	}
//}
