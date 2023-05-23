package day14.com.ict.edu5;

public class Ex01_main {
	public static void main(String[] args) {
		// 오버로딩(중복정의) : 한 클래스 안에서 같은 이름의 메서드가 여러개 존재하는 것
		//					(인자의 자료형이나 개수가 달라야 한다.)
		// 오버라이딩(재정의) : 상속관계에서 부모클래스 메서드와 자식클래스 메서드가 같은 것
		//					자식클래스가 부모클래스의 메서드를 가지고 와서
		//					내용을 자기에 맞게 변경해서 사용하는 것
		// 두가지는 이름은 비슷하지만 개념 자체는 아예 다른 것!!
		
		Ex01_Sub  test = new Ex01_Sub();
		test.sound();
		test.like();
		test.hobby();
		System.out.println(test.weight);
	}
}
