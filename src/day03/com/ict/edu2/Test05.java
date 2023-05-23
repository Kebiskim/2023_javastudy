package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		int su = 3781 ;
		
//		int thousand = su / 1000 ;
//		int hundred = (su - (thousand * 1000)) / 100 ;
//		int ten = (su - (thousand * 1000) - (hundred * 100)) / 10 ; 
//		int one = (su - (thousand * 1000) - (hundred * 100) - (ten * 10)) ;
//		
//		System.out.println("결과① : ");
//		System.out.println("천의 자리 : " + thousand);
//		System.out.println("백의 자리 : " + hundred);
//		System.out.println("십의 자리 : " + ten);
//		System.out.println("일의 자리 : " + one);
		
		System.out.println("====================================");
		
		int c = 0;
		int b = 0;
		int s = 0;
		int i = 0;
		int res = 0;
		
		c = su / 1000;     // 3
		res = su % 1000;   // 781
		
		b = res / 100;     // 7
		res = res % 100;    // 81
		
		s = res / 10;      // 8
		
		i = res % 10;     // 1
		
		System.out.println("천의 자리 : " + c);
		System.out.println("천의 자리 : " + b);
		System.out.println("천의 자리 : " + s);
		System.out.println("천의 자리 : " + i);
		
		
		
		
//		
//		int thousand = 1000;
//		int hundred = 100; 
//		int ten = 10;
//		su / 1000 ;
//		int hundred = su %  
//		int ten = (su - (thousand * 1000) - (hundred * 100)) / 10 ; 
//		int one = (su - (thousand * 1000) - (hundred * 100) - (ten * 10)) ;
//		
//		3000 + 700 + 80 + 1
//		
//		System.out.println("결과② : ");
//		System.out.println("천의 자리 : " + thousand);
//		System.out.println("백의 자리 : " + hundred);
//		System.out.println("십의 자리 : " + ten);
//		System.out.println("일의 자리 : " + one);
		
		// 결과 : 
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1

	}

}
