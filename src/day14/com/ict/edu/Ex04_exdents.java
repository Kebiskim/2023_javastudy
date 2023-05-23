package day14.com.ict.edu;

import java.util.Random;

public class Ex04_exdents {
	public static void main(String[] args) {
		// Random 클래스 사용하기
		Random ran = new Random();
		int num = ran.nextInt(10)+1;
		System.out.println(num);
	}
}
