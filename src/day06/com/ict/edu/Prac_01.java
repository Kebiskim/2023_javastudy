package day06.com.ict.edu;

public class Prac_01 {
	public static void main(String[] args) {
//		int i = 1;
//		int j = 1;
//		for (i = 1; i < 10; i++) {
//			
//			for (j = )
//		
//			// k별이 1,2,3,4,5 7,8,9,10,11      j 공백이 6
//						1,2,3,4,8,9,10,11	     j 5,6,7
//							                   j 4,5,6,7,8
//							                   j 3,4,5,6,7,8,9
//							                   j
		
		for(int i = 1; i < 10; i+=2) {
			for(int j = 10; j > i; j-=2) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 10; j > i; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
			// 줄어드는 부분에서는 j 값을 줄여줌.
			// 위 아래 부분은 같은 코드 (별을 찍냐, 공백을 찍냐 차이만 있음)
			
			
			// 다시 늘어나는 부분
			// 열이 줄어드는 만큼 찍어주는 갯수에 변화를 줘야 함.
			
		for(int i = 4; i < 11; i+=2) {    // 두번에 나눠서 찍어줘야 하므로, 2씩 올려서 찍는 횟수를 반으로 나눔.
			for(int j = 0; j < i; j+=2) {
				System.out.print("*");
			}
			for (int j = 11; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========================");
//		
//		for(int i = 1; i < 10; i++) {
//			for(int j = 2; j < i; j-=2) {
//				System.out.println(" ");
//			}
//			for(int j = 0; j > i; j++) {
//				System.out.println(" ");	// 반대 방향 부호를 입력해 줘서, 서로 엇갈리게 입력되도록 처리.
//			}
//		}
//		
//			
		// 6 열에서 시작. 
//			2개 찍고
		//7 일 경우, 
		
							                   
			// 10 8 6 4 2 0
			
	}
}
