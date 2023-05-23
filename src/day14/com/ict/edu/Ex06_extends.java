package day14.com.ict.edu;

import java.util.Random;

public class Ex06_extends extends Random {
	int num = nextInt();
	
	public Ex06_extends() {
		System.out.println("ex06 : " + num);
	}
	
	// 항상 main이 시작점!!
	public static void main(String[] args) {
		Ex06_extends test = new Ex06_extends();
	}
}
