package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 서울, 밴쿠버, 런던, 베른일 때, 
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 출력.
		
		Scanner scan = new Scanner(System.in);
		String country = "";
		String cont = "";
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("영국", "런던");
		map.put("캐나다", "밴쿠버");
		map.put("스위스", "베른");
	
		while (true) {
			try {
				System.out.println("나라 이름을 입력하세요!^^");
				country = scan.next();
				if (map.get(country) == null) {
					System.out.println("나라 이름을 제대로 입력하세요.");
					continue;
				}else {
				System.out.println(country + "의 수도는 " + map.get(country) + "입니다.");
				System.out.println("계속할까요? (y/n)");
				cont = scan.next();
				if (cont.equalsIgnoreCase("y")) {
					continue;
				}else if (cont.equalsIgnoreCase("n")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}		
				}
			}catch (Exception e){
					continue;
			} // catch문의 끝
		} // while 문의 끝
		
		
//		// 강사님 코드
//		Set<String> keys = map.keySet();
//		esc:
//		while(true) {
//			System.out.println("나라입력 : ");
//			String str = scan.next();
//			if(keys.contains(str)) {
//				String res = map.get(str);
//				System.out.println(str + "의 수도는 " + res + "입니다.");
//			}else {
//				System.out.println("데이터에 없는 나라입니다.");
//			}
//			while(true) {
//				System.out.println("계속할까요?(y/n) >>>");
//				String msg = scan.next();
//				if(msg.equalsIgnoreCase("y")) {
//					continue esc;
//				}else if(msg.equalsIgnoreCase("n")) {
//					break esc;
//				}else {
//					continue;
//				}
//			}
//		}
		
	}
}
