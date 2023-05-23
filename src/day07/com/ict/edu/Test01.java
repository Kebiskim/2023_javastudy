package day07.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + 5 ... FOR문을 이용한 누적합 (10까지)
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum = sum + (i * -1);
			}else {
				sum = sum + i;
			}
		}
		System.out.println("결과 : " + sum);
		System.out.println("=============================");
		
		// 페이징할 때 중요한 것!! 한 페이지에 10개씩 보이는 경우, 내 줄이 37개면 4페이지 필요함.
		// 농구공 5개가 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다.
		// int k1 = 127개이다. 몇 상자가 필요한가요?
		
		int k1 = 127;
		int res = k1 / 5;
		if (k1 % 5 != 0) {
			res = res + 1;
		}
		System.out.println("결과 : " + res);
		System.out.println("=============================");
			
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		// 0 0 0 0 를 하나로 보는 경우
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		
		System.out.println("=============================");
		
		// 0을 하나로 보는 경우 (0이 16개) 
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		
		System.out.println("=============================");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		
		// 1+(-2)+3+(-4)+5+ ... 와 같은 식으로 더했을 때, 몇까지 더해야 총합이 100이 되는지 구하시오.
		int sum2 = 0;
		int cnt = 0;
		for (int i = 1; i < 1000; i++) { // 1000 을 설정 어떻게 할 것인지??
			if (i % 2 == 0) {
				sum2 = sum2 + (i * -1);
			}else {
				sum2 = sum2 + i;
			}
			if (sum2 >= 100) {
				break;
			}
		}
		System.out.println(cnt);
		
		System.out.println("=============================");
		
		// ★ 이런 문제 같은 경우는 for문 대신, while문을 사용하는 것이 적합 (무한루프 => 언제까지 돌릴지 모르기 때문에)
		
		int sum_9 = 0;
		int cnt_2 = 0;
		int i = 1;
		while(true) { // 1000 을 설정 어떻게 할 것인지??
			if (i % 2 == 0) {
				sum_9 = sum_9 + (i * -1);
			}else {
				sum_9 = sum_9 + i;
			}
			cnt_2 = i; // 카운트 설정 => ★ 마지막 더한 숫자 값을 cnt_2에 저장!!
			if (sum_9 >= 100) {
				break;
			}
			i++;
		}
		System.out.println(cnt_2);
		
		System.out.println("=============================");
		
		// (5 번) - * for문
				// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
				// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int sum_3 = 0;
		for (i = 1; i<300; i++) {
			if (i % 2 == 1) {
				sum_3 = sum_3 + i ;
				if(sum_3<101&&sum_3>=100) {
					System.out.println("합한결과:"+sum_3);
					System.out.println("마지막더한숫자는:"+i+"입니다");
				}
			} else { 
				sum_3 = sum_3 + (i * -1);
			}
		}
		
		
		
	}
}
