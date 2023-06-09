package day15.com.ict.edu2;

// Ex01이 추상메서드를 가지고 있기 때문에, 같이 걸어줘야 함??
// 추상클래스를 상속했을 때 처리 방법
// 1. 부모클래스의 추상 메서드를 오버라이드 하면서 내용을 구체화시킨다. (부모는 구체화가 X) => 자식클래스는 일반 클래스가 된다.
// 2. 자식클래스도 추상 클래스로 만들면 오버라이딩 및 내용 구체화를 하지 않아도 된다.
public abstract class Ex02_extends extends Ex01_abstract {
	
//	아래가 1. 에 해당하는 내용
//	@Override
//	public void hobby() {
//		System.out.println("게임하기");
//	}
	
// 팀장이 기능 구현 없이 추상메서드 만들어서 상속받으라고 뿌리면 => 내가 구체화하는 것. 
// 하나의 갈래에서 나온 것이기 때문에 오류가 안 나도록 이렇게 작업.
	
}