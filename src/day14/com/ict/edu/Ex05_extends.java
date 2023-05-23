package day14.com.ict.edu;

import java.util.Random;

// 자식이 생성이 되어야 부모가 생성이 됨.
// Ex05_extends 생성 안되면 
// Random을 부모클래스처럼 가져와서 사용!!
public class Ex05_extends extends Random {
	
	// ★ 메인메서드 밑에 놔두고 위에 다른 메서드 만드는 것도 가능함!!
	int num = nextInt();
	
	public void play() {
		System.out.println("ex05 : " + num);
	}

	// static 메서드는 static 변수만 사용 가능
	public static void main(String[] args) {
//		System.out.println(num);
//		play();
		
		// 자기자신이라도 객체를 만들자. (main 안에서는 객체 불러와서 사용해야 함)
		// 아래 test는 단순한 참조변수. static or instance가 아님.
		// static, instance는 전역변수를 의미.
		Ex05_extends test = new Ex05_extends();
		test.play();
		
	}
}
