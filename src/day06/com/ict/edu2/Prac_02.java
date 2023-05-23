package day06.com.ict.edu2;

public class Prac_02 {
	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		
		// i는 줄, j 는 점 
		
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j)
					System.out.print(" ");
				else 
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}