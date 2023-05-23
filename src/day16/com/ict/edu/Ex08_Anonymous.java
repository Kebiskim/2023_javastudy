package day16.com.ict.edu;

// 추상클래스 : 추상메서드를 하나 이상 가지고 있는 클래스

abstract class Abc{
	int data = 1000;
	public abstract void printData();
}

// 가장 일반적인 방법 : 상속받는 방법
class AbcTest extends Abc{
	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}

class AbcTest2{
	// 상속받지 않고 바로 객체 생성
	// 위에 추상메서드가 미완성이니까, 객체를 쓰고 싶으면 객체를 완성해서 해라.
	// abc에 주소가 저장됨.
	Abc abc = new Abc() {
		@Override
		public void printData() {
			System.out.println("data2 : " + data);
		}
	};
}

class AbcTest3{
	// 메서드나 메서드 인자에 사용된다.
	public void prn() {
		new Abc() {
			@Override
			public void printData() {
				System.out.println("data3 : " + data);
			}
		}.printData();	// 위에 Abc() 끝나면서 printData() 메서드를 호출하는 것. 많이 씀!!
	}
	// 메서드 안에 있는 것들 
//	public void prn2(new Abc);
}

public class Ex08_Anonymous {
	public static void main(String[] args) {
		// 가장 일반적인 방법 (상속)
		AbcTest t1 = new AbcTest();
		t1.printData();
		
		// InnerClass (객체를 상속받지 않고 class 안에서 만드는 방법)
		AbcTest2 t2 = new AbcTest2();
		System.out.println(t2.abc); // 주소 출력
		t2.abc.printData(); // abc. 안에 있는 걸 입력해야, 메서드나 데이터가 나올 수 있음
		
		AbcTest3 t3 = new AbcTest3();
		t3.prn();
	}
}