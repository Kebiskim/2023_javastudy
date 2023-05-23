package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_static p1 = new Ex02_static();
		System.out.println(p1.su1); // 11
		System.out.println(p1.su2); // 11 
		System.out.println();
		
		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1);
		System.out.println(p2.su2); // static에서 값을 저장하고 있으므로, 모든 클래스가 공유한다.
		// static은 클래스를 호출해도 초기화되지 않고 그 값을 static에 가지고 있음. 11 > 12 > 13
		System.out.println();
		
		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1);
		System.out.println(p3.su2);
		System.out.println();
		
		System.out.println(p1.su1);
		System.out.println(p1.su2);
		
	}
}