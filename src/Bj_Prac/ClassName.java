package Bj_Prac;

class ClassName<E>{
	
	// 클래스와 같은 E 타입이더라도
	// static 메소드는 객체가 생성되기 이전 시점에
	// 메모리에 먼저 올라가기 때문에
	// E유형을 클래스로부터 얻어올 방법이 없다.
//	static E genericMethod_2(E o) {
//		return o;
//	}
	
	private E element; // 제네릭 타입 변수
	
	void set(E element) { // 제네릭 파라미터 메소드
		this.element = element;
	}
	
	E get() { // 제네릭 타입 반환 메서드 
		return element;
	}
	
	<T> T genericMethod(T o) {
		return o;
	}
	
	static <E> E genericMethod1(E o) {
		return o;
	}
	
	static <T> T genericMethod2(T o) {
		return o;
	}
}