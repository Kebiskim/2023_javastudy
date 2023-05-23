package day11.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_method t1 = new Ex03_method(); // 생성자를 안 만들어서 기본 생성자를 자동으로 객체 생성
//		
//		t1.getSum();
//		t1.getAvg();
//		t1.getHak();
//		
//		System.out.println(t1.sum);
//		System.out.println(t1.avg);
//		System.out.println(t1.hak);
		
		
		// 위에 코드보다 아래처럼 하는 것이 더 정상적인 코드!!
		// return이 있으니까 받아주고 하는 것!!
		int k1 = t1.getSum();
		double k2 = t1.getAvg();
		String k3 = t1.getHak();
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
	}
}