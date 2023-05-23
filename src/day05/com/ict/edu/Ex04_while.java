package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while문 : for 문과 같은 반복문
		// 형식1)
		// 		  초기식;
		// 		  while(조건식){
		// 		  조건식이 참이면 실행할 문장;
		// 		  조건식이 참이면 실행할 문장;
		//		  증감식;
		//        }
		// 		  while문의 끝을 만나면 조건식으로 간다. (for문은 끝을 만나면 증감식으로 간다!!)
		
		// 형식2)
		// 		  초기식;
		// 		  while(true){   // ★ 조건식이 아니라, 대신 true 삽입
		//  	  if(빠져나갈 조건){
		//			 break;
		//        }
		// 		  조건식이 참이면 실행할 문장;
		// 		  조건식이 참이면 실행할 문장;
		//		  증감식;
		//        }
		// 		  while문의 끝을 만나면 조건식으로 간다. (for문은 끝을 만나면 증감식으로 간다!!)
		
		// 1-10 까지 출력하자.
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("========================");
		
		i = 1;
		while(true) {
//			if(i == 11) break;	// 여기서 2씩 증가시켜서 11을 안 지나갈 경우 => 무한루프.
			if (i >= 11) break; // for문에서는 작을 경우에 계속 진행. while은 클 경우에 stop.
			System.out.println(i);
			i++;
		}
		
		System.out.println("=================================");
		
		// 0~10까지 중 짝수만 출력
		i = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
			
		System.out.println("=================================");	
		
		// 구구단 중 7단 출력
		int num_1 = 1;
		while (num_1 <= 9) {
			System.out.println("7 곱하기 " + num_1 + "은 : " + 7 * num_1);
			num_1++;
		}
		
		System.out.println("=================================");
		
		// 1-10 누적합 (합계 구하기)
		int num_2 = 1;
		int sum = 0;
		while (num_2 <= 10) {
			sum = sum + num_2;
			num_2++;
		}
		System.out.println("1-10까지의 누적 합은 : " + sum);
		
		System.out.println("=================================");
			
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		
		int crlf = 1;
		while (crlf <= 4) {
			int num_3 = 1;
			while (num_3 <= 4) {
				System.out.print("0" + " ");
				num_3++;
			}
			System.out.println();
			crlf++;
		}
		
		System.out.println("===============선생님=============");
		
		int ans = 1;
		while (ans < 17) {
			System.out.print("0 ");
			if (ans % 4 == 0) {
				System.out.println();
			}
			ans++;
		}
		
		
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ 
//		☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆
		
		System.out.println("=================================");
		
		char star_1 = '☆';
		char star_2 = '★';
		
		int k = 1;
		while (k <= 9) {
			int l = 1;
			while (l <= 9) {
				if (l % 2 == 0) {
					System.out.print(star_2 + " ");
				}
				else {
					System.out.print(star_1 + " ");
				}
				l++;
			}
			System.out.println();
			k++;
		}
		// 반복수 설정할 때, 작은 반복수는 큰 while문의 안쪽에서 재선언 해줘야 함!!!
		
//		 ★★★★
//
//	      ★★★
//
//	       ★★
//	          
//	        ★
		
		char star_3 = '★';
		
		int k_1 = 4;
		int space_1 = 1;
		while (space_1 <= 4) {
			while (k_1 >= 1) {
				System.out.print(" ");
				System.out.print(star_3 + " ");
				k--;
			}
			System.out.println();
			space_1++;
		}
		
		
		}
	}
}
