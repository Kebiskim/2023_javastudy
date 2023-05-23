package day06.com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
		// 구구단 - 1 
		int i = 2;
		while (i < 10) {
			// int i = 2; for문과 다르게, 안에서 선언 새로 못함.
			int j = 1;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			i++;
		}
		
		// 구구단 - 2
		int i_2 = 2;		
		while (i_2 < 10) {
			int j = 1;
			while(j < 10) {
				System.out.print(i_2 + " * " + j + " = " + i_2 * j + "  ");
				j++;
			}
			System.out.println();
			i_2++;
		}
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		// 구구단 - 3
		int i_3 = 1;
		while (i_3 < 10) {
			int j = 2;
			while (j < 10) {
				System.out.print(j + " * " + i_3 + " = " + j * i_3 + "  ");
				j++;
			}
			System.out.println();
			i_3++;
		}
	}
}
