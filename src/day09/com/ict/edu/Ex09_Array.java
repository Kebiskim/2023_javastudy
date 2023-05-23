package day09.com.ict.edu;

public class Ex09_Array {
	public static void main(String[] args) {
		// ☆고정길이 다차원 배열
		// 선언과 생성을 하나로
		// 자료형[][] 이름 = new 자료형[1차원 배열의 수][1차원 배열 안에 존재하는 배열의 크기];
		
		char[][] ch = new char[4][2];
		
		// ★고정길이 일때만 가능
		ch[0][0] = 'A';
		ch[0][1] = 'a';
		
		ch[1][0] = 'B';
		ch[1][1] = 'b';
		
		ch[2][0] = 'C';
		ch[2][1] = 'c';
		
		ch[3][0] = 'D';
		ch[3][1] = 'd';
		
		// 출력
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println("***********************");
		
		// 고정길이, 가변길이 모두 사용하는 방법
		// 위에 방법은, 고정길이 일때만 사용가능한 방법!!! (많이 사용, 보통 고정길이 사용)
		int[][] su = new int[3][2];
		
//		int k1[] = {'A', 'a'}; 먼저 하고, 그담에 상위 배열에 넣는 순으로 진행하는 것. (가변길이)
		
		int[] k1 = new int[2];
		k1[0] = 10;
		k1[1] = 20;
		int[] k2 = {100,200};
		int[] k3 = {1000,2000};
		
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		System.out.println("***********************");
		// 선언, 생성, 초기값 저장을 한번에
		
//		String[][] str = { {}, {}, {}, {} };
		String[][] str = { {"java", "JAVA"}, {"가나", "초콜렛"}, {"12", "89"}, {"kkk", "#$%$^"} };
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[j].length; j++) {
				System.out.println(str[i][j]);
			}
		}
		// 고정길이 의 기준 : 뒤에 있는 [], new char[4][2] 이면 [2] 부분이 고정 길이!!
		
		
		
		
	}
}
