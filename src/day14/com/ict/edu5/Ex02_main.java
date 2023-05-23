package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		dog.sound();
		dog.hobby();
		System.out.println(dog.eyes);
		System.out.println(dog.color);
		
		cat.sound();
		cat.hobby();
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		System.out.println();
		
		// 객체생성
		// 부모클래스 변수 = new 자식클래스 생성자();
		// 선언만 하고, 객체생성은 뒤에서 하는 것. 둘다 생성할 필요가 없음.
		// 초기값 null 줘야 함!! (변수생성할 때)
		Ex02_Animal animal = null;
		int num = 1;
		if (num == 1) {			// 고양이
			animal = new Ex02_Cat();
		}else if (num == 2) {	// 강아지
			animal = new Ex02_Dog();
		}
		// 명령어는 같은데 반응이 달라진다 => 다형성
		// ★★★ 위 코드처럼 => 오버라이딩 말고 부모만 가지고 있는 것은 못 씀!!!
//		animal.play(); 못가져 옴. 자식클래스만 가지고 있는 것 못가져 옴.
		// 부모클래스가 먼저라서, 자식에만 있는 것 못 쓰는데, 오버라이딩 된 것에 한해서는
		// 자식클래스가 먼저라서 사용이 가능함!!!

		animal.sound();
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		
	}
}
