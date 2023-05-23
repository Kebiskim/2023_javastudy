package day15.com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {
		// SF => 모두 static final!! 접근 전에 객체생성을 할 필요가 없음.
		System.out.println(Ex01_interface.SU1);
		System.out.println(Ex01_interface.SU2);
		System.out.println(Ex01_interface.su3);
		System.out.println(Ex01_interface.su4);
		
		Ex01_interface.like();
		System.out.println();
		
		Ex01_extends t1 = new Ex01_extends();
		t1.sound();
		t1.play();
		
		// sound랑 play 구현 안해서 구현 하라고 나오는 것들!! 아래줄
		// 익명내부클래스 타입 (아직 몰라도 됨)
		// 굳이 이런식으로 안하고, extends에 3번 아래 예시처럼 작성을 함.
		// 아래와 같은 작성방식 추천 안함!! 일반적으로 안 쓴다.
		Ex01_extends2 t2 = new Ex01_extends2() {
			
			@Override
			public void sound() {
				System.out.println("음악듣기");
				
			}
			
			@Override
			public void play() {
				System.out.println("오락실게임하기");
				
			}
		};
		
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
		System.out.println();
		
		Ex01_extends4 t3 = new Ex01_extends4();
		System.out.println(t3.name);
		t3.tour();
		t3.sound();
		t3.play();
		 
		
	}
}
