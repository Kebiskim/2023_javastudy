package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라서 실행문을 반복 처리한다.
		// 형식) for(초기식; 조건식; 증감식){
		//		    조건식이 참일 때 실행할 문장;
		//		    조건식이 참일 때 실행할 문장;
		//		    조건식이 참일 때 실행할 문장;
		//      }
		// ** for문을 만나면 무조건 초기식으로 이동
		//	  초기식은 조건식으로 이동
		//    조건식이 참이면 for문 실행, 거짓이면 for문 실행하지 않음.
		//	  for문의 끝을 만나면 무조건 증감식으로 간다.
		
		// {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용할 수 없음)
		
		// 안녕하세요를 열번 출력하기
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = 안녕하세요.");
		}
		
		// 0-10까지 출력
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		
		// 0-10까지 짝수만 출력
		for (int i = 0; i < 11; i = i + 2) {
			System.out.println(i);
		}
		
	
		// {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용할 수 없음) => 굳이 변수를 새로운 걸로 쓸 필요 X
		// escape 문자 => \n, \t
		
		// if (홀/짝) ? 짝수일 때만 출력 : ??
		// 회사 측에서 요구하는 것 : 일일이 검사하는 것, 위에처럼 (i = i + 2)로 쓰기보다는
		// 0-10까지 홀수만 출력
		for (int i = 1; i < 11; i = i + 2) {  // 초기값 변경해줘야 함.
			System.out.println(i);
		}
		// 초기값이 변경되는 것이, 회사에서는 문제가 될 수 있음!!
		// 그래서, 뛰어넘어가는 것 보다는, 0, 1, 2, 일때 모두 판별해서 하는 것이 오류가 훨씬 적음!
		
		// ▼▼▼ 그래서 아래와 같이 코드 짜는 것이 더 좋음!!
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 구구단 중 7단 출력
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " ");
			}
		}
		
		// 변하는 것과, 변하지 않는 것을 구분해서 적어주면 됨!
		for (int i = 1; i < 10; i++) {
			System.out.println("7 * " + i + " = " + (7 * i));
		}
		
		int sum = 0;
		// 1-10 누적합 (합계 구하기)
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("누적합 : " + sum);
		// 변수는 가장 마지막에 입력된 하나의 값만 기억함!
		// 누적합의 공식 => [이전저장 변수 = 이전저장 변수 + 현재값]
		// sum = sum + i => "i의 누적합" 이라고 부름 // 초기값을 0으로 줘야 함 (더하기)
		// sum = sum * i => "i의 누적곱" 이라고 부름 // 초기값을 1로 줘야 함 (곱하기)
		// ** 느낌으로 코딩하지 말고, for 문과 if 문이 어떻게 돌아가는지 머리로 이해를 하고, 사용해야 함.
		
		// 0~10까지 짝수의 누적합
		int sum_2 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 2) {
				sum_2 = sum_2 + i;
			}
		}
		System.out.println("짝수의 합: " + sum_2);
		
		// 7! 구하기
		int sum_3 = 1;
		for (int i = 1; i <= 7; i++) {
			sum_3 = sum_3 * i;
		}
		System.out.println(sum_3);
		
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		int sum_4 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum_4 = sum_4 + i;
			}else  if (i % 2 == 0) {
				sum_4 = sum_4 + (int)(i*-1);
			}
		}
		System.out.println("결과 값은 : " + sum_4);

	}
}



