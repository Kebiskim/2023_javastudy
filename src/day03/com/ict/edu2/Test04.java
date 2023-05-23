package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카가 6,500원이다.
		// 친구와 둘이서 15,000원을 내고 주문했다.
		// 잔돈은 얼마 남는가? (단, 부가세 10% 포함)
		
		int mocha = 6500;
		int pay = 15000;
		int quantity = 2;
		
		int mocha_VAT = (int)(mocha * 1.1);
		int total_price = mocha_VAT * quantity;
		int change = (int)(pay - total_price); 
		
		System.out.println("잔돈은 : " + change + "원 입니다.");
		
		System.out.println("============================");
		
//		//입력
//		 * String coff = "카페모카";
//		 * int dan = 6500;
//		 * int su = 2;
//		 * int in = 15000;
//		 * 
//		 * // 부가세를 구하기 위해서 총 금액을 구하자.
//		 * int total = dan * su;
		
		// 둘 중 하나만 사용하자.
//		 * int vat = total / 10;
//		 * int vat2 = (int) (total * 0.1); // 실수를 정수에 강제로 맞추려면 캐스팅 (형변환) 해야 함.
//		                                   // 빨간줄에 마우스 가져가서, add cast to int 눌러주면 자동 진행.
//		   int out = in - (total + vat);
		// System.out.println("잔돈 : " + out);
		
		// 위 정보를 한번에 처리
//		int out2 = in - (int)(total * 1.1)
//		System.out.println("잔돈 : " + out2);
	}
}
