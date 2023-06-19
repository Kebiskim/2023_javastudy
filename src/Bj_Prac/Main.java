package Bj_Prac;

public class Main {
	public static void main(String[] args) {
		
		ClassName<String> a = new ClassName<String>();
		ClassName<Integer> b = new ClassName<Integer>();
		
		a.set("10");
		b.set(10);
		
		System.out.println("a data : " + a.get());
		// 반환된 변수의 타입 출력
		System.out.println("a E Type : " + a.get().getClass().getName());
		
		System.out.println();
		
		System.out.println("b data : " + b.get());
		System.out.println("b E Type : " + b.get().getClass().getName());
		System.out.println();
		
		// 제네릭 메소드 Integer
		System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());
		// 제네릭 메소드 String
		System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());
		// 제네릭 메소드 ClassName b => 파라미터의 타입에 따라 T의 타입이 결정된다!!
		// 즉, 클래스에서 지정한 제네릭 유형과 별도로 메소드에서 독립적으로 제네릭 유형을 선언하여 쓸 수 있다.
		System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());
		
		// ClassName 객체가 생성되기 전에 접근할 수 있으나, 유형을 지정할 방법이 없어 에러가 남
//		ClassName.genericMethod_2(3);
		// => 제네릭이 사용되는 메소드를 정적메소드로 두고 싶은 경우,
		// 제네릭 클래스와 별도로 독립적인 제네릭이 사용되어야 한다.
		
		// 제네릭 메소드1 Integer
		System.out.println("<E> returnType : " + ClassName.genericMethod1(3).getClass().getName());
		
		// 제네릭 메소드1 String
		System.out.println("<E> returnType : " + ClassName.genericMethod1("ABCD").getClass().getName());
		
		// 제네릭 메소드 2 ClassName a
		System.out.println("<T> returnType : " + ClassName.genericMethod2(a).getClass().getName());
		
		// 제네릭 메소드 2 Double
		System.out.println("<T> returnType : " + ClassName.genericMethod2(3.0).getClass().getName());
	}
}
