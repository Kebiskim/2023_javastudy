package day05.com.ict.edu;

public class Homework_May_1 {
public static void main(String[] args) {
//	[5/1 숙제] - 모레까지 해오기
//
//	(1 번) - * for 문 사용해서 풀기
//	1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
	
	System.out.println("1번 문제 : ");
	
	int i = 1;
	int sum = 0;
	
	for (i = 1; i <= 10; i++) {
		if (i % 2 == 0) {
			sum = sum + (int)(i * -1);
		}
		else
			sum = sum + i; 
	}
	System.out.println(sum);
	System.out.println("==================================");

//	(2 번) - * if~ else문 사용
//	농구공 5개씩 한 박스에 들어간다. 
//	 40개면 8상자,  26개면 6개이다.
	
	System.out.println("2번 문제 : ");
	
	int ball = 40;
	int ball_in_box = 5;
	int box = 0;
	
	if (ball % 5 ==0) {
		box = ball / ball_in_box;
	}
	else 
		box = ((int)((ball / ball_in_box)+1));
	
	System.out.println("필요한 상자 수는 " + box + "박스");
	System.out.println("==================================");

//
//	(3 번) - * for문으로 풀기
//	0 0 0 0
//	0 0 0 0
//	0 0 0 0
//	0 0 0 0
		
	System.out.println("3번 문제 : ");

	int i_2 = 1;
	for (i_2 = 1; i_2 <= 4; i_2++) {
		System.out.println("0 0 0 0");
	}
	
	System.out.println("==================================");
//
//	(4 번) - * 이중 for문으로 풀기
//	1 0 0 0
//	0 1 0 0
//	0 0 1 0
//	0 0 0 1
	
	System.out.println("4번 문제 : ");
	
	int i_3 = 1;
	int j = 1;

	for (i_3 = 1; i_3 <= 4; i_3++) {
		for (j = 1; j <= 4; j++) {
			if (i_3 == j) {
				System.out.print("1 ");
			}
			else 
				System.out.print("0 ");
		}
		System.out.println();
	}
	
	System.out.println("==================================");

//
//	(5 번) - * for문 
//	1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,  몇까지 더해야 총합이 100이상이 되는지 구하시오.
	
	System.out.println("5번 문제 : ");
	
	int i_4 = 1;
	int sum_2 = 0;
	for (i_4 = 1; i_4 <= 200; i_4++) {
		if (i_4 % 2 == 0) {
			sum_2 = sum_2 + (int)(i_4 * -1);
			System.out.println("합한 결과는 : " + sum_2);
			System.out.println("마지막 더한 숫자는 : " + i_4);
			System.out.println();
		}
		else
			sum_2 = sum_2 + i_4;
			System.out.println("합한 결과는 : " + sum_2);			
			System.out.println("마지막 더한 숫자는 : " + i_4);
			System.out.println();
	}
	
	System.out.println("==================================");
	System.out.println("5번 문제 번외 : ");
	
	int i_9 = 1;
	int sum_9 = 0;
	
	loop:
	for (i_9 = 1; i_9 <= 500; i_9++) {
		if (i_9 % 2 == 0) {
			sum_9 = sum_9 + (int)(i_9 * -1);
			}
		else 
			sum_9 = sum_9 + i_9; 
			if (sum_9 >= 100) {
				break loop;   
			}
	}
	System.out.println("합한 결과는 : " + sum_9 + "입니다.");			
	System.out.println("마지막 더한 숫자는 : " + i_9 + "입니다.");
	
	
	System.out.println("==================================");
//
//	(6 번) - * for문 
//	*
//	* *
//	* * *
//	* * * *
	
	System.out.println("6번 문제 : ");
	
	int i_5 = 1;
	int j_2 = 1;
	for (i_5 = 1; i_5 <= 4; i_5++) {
		for (j_2 = 1; j_2 <= 4; j_2++) {
			if (j_2 <= i_5) {
				System.out.print("*");
			}
			else 
				System.out.print(" ");
		}
		System.out.println();
	}
	
	System.out.println("==================================");
	
//
//	(7 번) - * for문 
//	      *
//	    * *
//	  * * *
//	* * * *
	
	System.out.println("7번 문제 : ");
	
	int i_6 = 1;
	int j_3 = 4;
	for (i_6 = 1; i_6 <= 4; i_6++) {
		for (j_3 = 4; j_3 >= 1; j_3--) {
			if (j_3 > i_6) {
				System.out.print(" ");
			}
			else 
				System.out.print("*");
		}
		System.out.println();
	}
	
	
	}
}
