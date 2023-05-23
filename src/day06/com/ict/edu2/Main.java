package day06.com.ict.edu2;





import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		a = 0;
		b = 0;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		scan.close();
		
		if (a > b)
			System.out.println("<");
		
		else if (a < b)
			System.out.println(">");
		
		else if (a == b)
			System.out.println("==");
		else {
		
		}
	}
}


//
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}
//}