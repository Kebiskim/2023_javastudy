//package day11.com.ict.edu;
//
//import java.util.Scanner;
//
//public class Ex08_main {
//	public static void main(String[] args) {
//		// 5명의 이름, 국어, 영어, 수학 입력
//		// 이름, 총점, 평균, 학점, 순위 구하기
//		// 순위 기준으로 오름차순 정렬 출력
//		
//		int students = 5;
//		Scanner scan = new Scanner(System.in);
//		
//		// Ex08_method로 만들어진 객체만 저장하는 배열 (객체형 배열 = 참조자료형 배열)
//		// int[] k1 = new int[];
//		// 기본자료형 이름 int 대신 클래스 이름을 사용하는 것!! ▼
//		 Ex08_method[] arr = new Ex08_method[students];
//		// ★ arr 배열은, Ex08_method 자료형으로 만든 것들만 받을 수 있다는 의미!!
//		// Q. length()와 length의 차이 Shift F2에서 찾아보기!!
//		 
//		for (int i = 0; i < arr.length; i++) {
//			Ex08_method person = new Ex08_method(); // 안에다 생성해야 함 (할때마다 초기화해야 하니까)
//			// new 해서 새로 만들 때마다, 실질적인 주소는 서로 다름.
//			
//			System.out.println("이름 : ");
//			person.name = scan.next();				// method 안에다 넣은 것.
//			
//			System.out.println("국어 : ");
//			person.kor = scan.nextInt();
//			
//			System.out.println("영어 : ");
//			person.eng = scan.nextInt();
//			
//			System.out.println("수학 : ");
//			person.math = scan.nextInt();
//			
//			// 변수 이름이나 메소드를 이용해서 집어넣고, 꺼냄. array에서는 주소를 이용해서 이렇게 함!!
//			
//			person.sum = person.kor + person.eng + person.math;
//			
//			person.avg = (int)((person.sum/3.0)*10/10.0);
//			
//			if (person.avg >= 90) {
//				person.grade = "A학점";
//			}
//			else if (person.avg >= 80) {
//				person.grade = "B학점";
//			}
//			else if (person.avg >= 70) {
//				person.grade = "C학점";
//			}
//			else {
//				person.grade = "F학점";
//			}
//			
//			person.rank = 1;
//			
//			// 해당 반복문을 통해 만들어진 class 들을, array 안에 넣는 것 => class가 자료형이 되는 것으로,
//			// 이를 참조 자료형이라고 한다.
//			// Ex08_method[] arr = new Ex08_method[students];
//			// arr[0].name 으로 부름. => arr[0].Ex08_method;
//			
//			arr[i] = person;
//
//		}
//		
//		// 순위
//		
//		
//		// 정렬
//		
//		
//		// 출력
//	}
//}
