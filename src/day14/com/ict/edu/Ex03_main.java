package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체로 만들면 부모클래스는 먼저 알아서 만들어진다.
		// 클래스는 그냥 못쓰고, 객체로 만들어야 쓸 수 있음.
		// 자식클래스가 부모클래스를 사용한다 => 자식보다 부모클래스가 먼저 만들어진다는 뜻.
		// 부모클래스와 주소가 같다. 부모클래스가 위쪽에 나온다.
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서 생성자호출 : " + sub);
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		// 본인한테 없지만 부모한테 있는 것이라서 사용 가능!!
		System.out.println(sub.addr);
		
		// private는 안됨..
		// 외부에서는 private 호출 안됨
//		System.out.println(sub.cat);
//		System.out.println(sub.dog);
		
		// static (접근제한자가 우선순위가 높다.)
		System.out.println(sub.playStation);
		System.out.println(Ex03_Super.playStation);
//		System.out.println(Ex03_Sub.computer);
	}
}
