package day11.com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04_method t1 = new Ex04_method();
		
		t1.add();
		System.out.println(t1.result);
		
		t1.add(1000);
		System.out.println(t1.result); // => 기존 값에 1000 더함 => 1000
		
		t1.add(100,24);
		System.out.println(t1.result); // => 기존 값 상관 x, 100 + 24 => 124
		
		int k1 = t1.sub();
		System.out.println(k1);
		
		int k2 = t1.sub(120);
		System.out.println(k2);
		
		int k3 = t1.sub(24, 12);
		System.out.println(k3);
		
	}
}