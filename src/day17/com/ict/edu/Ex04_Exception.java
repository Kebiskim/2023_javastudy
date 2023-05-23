package day17.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

// throws : 예외전가, 예외양도
// 			예외가 발생하면 예외처리를 해야 하지만, 현재 메서드에서는 할 수 없어서 자신을 호출한
//			곳으로 예외객체를 전달, 나중에라도 예외처리(try~catch~)를 해주어야 함.
public class Ex04_Exception {
	
	public void setData(String str) throws NumberFormatException {
		// 내용이 없지 않으면, 있으면. str 길이가 0보다 크면 (즉, str에 정보가 있으면)
		if(str.length()>=1) {
			// str의 첫글자를 추출하자.
			String res = str.substring(0, 1);
			try {
			prnData(res);
			}catch (Exception e) {
				System.out.println("첫글자만 ㄱㄱ");
			}
		}
	}
	
	// 예외전가 => prnData를 호출한 메서드로 예외를 전달하기.
	public void prnData(String res) throws NumberFormatException {
//		try {
			int dan = Integer.parseInt(res);
			System.out.println(dan + "단");
			for (int i = 0; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
//		}catch (NumberFormatException e) {
//		System.out.println("첫글자는 숫자만 입력");
//		}
	}
	
	// throws는 class 에는 붙일 수 없음! (메서드에만 가능)
	// throws => 오류의 첫 발생지점을 알 수 있는 지표. 모아서 한꺼번에 관리하기 위함.
	public static void main(String[] args) throws NumberFormatException {
		Ex04_Exception test = new Ex04_Exception();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		String msg = scan.next();
//		try {
		test.setData(msg);
//		}catch (NumberFormatException e) {
//			System.out.println("숫자만 입력");
//		}
	}
}
