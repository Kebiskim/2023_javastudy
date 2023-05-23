package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat(); // 부모가 먼저 만들어지고, 자식이 그 다음에 만들어짐.
		
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		
		cat.sound();
		cat.hobby();
		cat.sleep();
		cat.play();
	}
}