package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외처리와 상관없이 반드시 실행해야 하는 문장을 처리할 때 사용
//			주로 DB, 입/출력, 네트워크에서 사용
// 형식 : try {
//			예외 발생 가능한 문장들;
//			예외 발생 가능한 문장들;
//			예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
//			예외 발생 가능한 문장들;
//			}catch( 발생한 예외 객체 e ){
//			예외 발생 시 처리하는 문장;
//			}catch( 발생한 예외 객체 e ){
//			예외 발생 시 처리하는 문장;
//			}finally{
//			반드시 실행해야 하는 문장;
//			}
public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int su1 = 50;
			System.out.println("정수 입력 : ");
			// 메모리에 남아있는 것 (가 입력 시 가 + enter가 남아있음) 그래서 nextLine으로 지워줘야 함.
			// Scanner가 새로 만들어지면 메모리가 초기화되기 때문에, 작업 시 문제 없음.
			int su2 = scan.nextInt();
			System.out.println("정답 : " + (su1/su2));
		}catch (InputMismatchException e){
			System.out.println("숫자를 입력하세요");
			return; // JVM으로 감 => 끝남 => ★ finally는 하고 되돌아 간다. 밑에는 안함.
		}catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}finally {
			System.out.println("무조건 찍히는 문장");
			scan.close();
		}
		System.out.println("수고하셨습니다.");
		// scanner 클로즈는 무조건 finally 쪽에 넣어줘야 함. 어떤 경우에도 실행되도록.
	}
}
