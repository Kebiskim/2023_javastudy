package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		// break와 continue
		// break : 현재 위치의 블록을 탈출하는 예약어(명령어)
		// continue : continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
		// 보통 if문과 함께 사용한다.
		// break는 for문과 while문 모두 사용, continue는 for문에만 사용하기 (while이랑 사용하지 않기. (무한루프 문제))
		
		// 1-10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1-10까지 출력 (6일 때 브레이크)
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6) break;
		}
		System.out.println();
		
		// 1-10까지 출력 (6일 때 브레이크)
		for (int i = 1; i < 11; i++) {
			if (i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	
		// 1-10까지 출력 (6일 때 브레이크)
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6) continue;	// continue 만나면 무조건 증감식으로 이동함!!
		}
		System.out.println();
		
		// 1-10까지 출력 (6일 때 브레이크)
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;		// 6일 때는 출력 안함 (continue 아래 실행 안하기 때문)
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("===============================");
		
		// 0-10 홀수만 출력하자 (continue) => 회사에선 이걸 더 많이 씀.
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 1) {
				System.out.println(i); 
			}
		}
		
		// 0-10 홀수만 출력하자 (continue)
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 1) continue;
			System.out.println(i);
		}
	}
}