package day15.com.ict.edu2;


// implement the inherited abstract => 추상 메서드임 (인터페이스가 아니라)
public class Ex03_Sub extends Ex03_abstract {
	
	// 기획한 사람이 의도한 것에서 바꿀 수가 없음!! (오버라이딩 해서 가져오기 때문에)
	// 이렇게도 쓸 수 있다는 것! (기획한 사람이 메서드 만들어서 뿌리면 => 상속받아서 구체화하면 됨)
	// 이보다 더 강력한 것이 바로 ☆ 인터페이스!!
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
}
