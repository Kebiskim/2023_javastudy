package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch : 예외가 하나가 아니라 여러가지가 발생할 경우 사용
//	  주의사항 : ★ Exception을 사용할 경우 반드시 가장 아래 catch문에 사용
	// 형식 : try {
	//			예외 발생 가능한 문장들;
	//			예외 발생 가능한 문장들;
	//			예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
	//			예외 발생 가능한 문장들;
	//			}catch( 발생한 예외 객체 e ){
	//			예외 발생 시 처리하는 문장;
	//			}catch( 발생한 예외 객체 e ){
	//			예외 발생 시 처리하는 문장;
	//			}
public class Ex02_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ☆ Scanner를 밖으로 빼면 문자 입력 시 무한루프가 됨.
		esc:
		while (true) {
			try {
			int su1 = 50;
			int su2 = 10;
			System.out.println("정수 입력 : ");
			// 메모리에 남아있는 것 (가 입력 시 가 + enter가 남아있음) 그래서 nextLine으로 지워줘야 함.
			// Scanner가 새로 만들어지면 메모리가 초기화되기 때문에, 작업 시 문제 없음.
//			int su2 = scan.nextInt();
			System.out.println("정답 : " + (su1/su2));

//			}catch (InputMismatchException e){
				System.out.println("숫자를 입력하세요");
				// ★ 아랫줄 추가해 주면 오류 안남!! nextLine 으로 깨끗하게 비우는 것.
				scan.nextLine();
			}catch (ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다.");
			}
		} // while문 끝
		
	}
}
