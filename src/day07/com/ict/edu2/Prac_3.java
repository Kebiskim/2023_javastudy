package day07.com.ict.edu2;

import java.util.Scanner;

public class Prac_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name_1 = "김돋옫오동김동";
		String result = "";
		int j = name_1.length();
		for (int i = 0; i < j; i++) {
			char s = name_1.charAt(i);
			if (i == 0 || i == j-1) {
				result += s;
			}else {
				result += "*";
			}
		}
		System.out.println(result);
		
		
		// 전화번호 : 010-9876-7410 => 010-9876-****, 010-****-7410으로 변경하기
		String num = "010-9876-7410";
		result = "";
		char star = '*';
		
		int l = num.length();
		int dash = num.indexOf("-");
		int dash_2 = num.lastIndexOf("-");
		for (int i = 0; i < l; i++) {
			char s = num.charAt(i);
			if (i > dash_2) {
				result += star;
			}else {
				result += s;
			}
		}
		System.out.println(result);
		
		
		String t1 = "";
		boolean e1 = t1.isEmpty();
		System.out.println(e1);
		
		t1 = "사과, 망고, 딸기, 등등";
		int room_count = 1;
		String[] arr1 = t1.split(",", room_count); // 1로 넣으면 한 방에 전부 들어감!!
		System.out.println(arr1[0]);
		
		t1 = "010-2125-5465";
		String t2 = t1.substring(t1.indexOf("-")+1, t1.lastIndexOf("-")); // endIndex 위치는 포함 XX
		System.out.println(t2);
		
		
		System.out.println("**********************");
		// substring으로 010-5648-6541" 가운데 가리기
		t1 = "010-5648-6541";
		String star2 = "****";
		t2 = "";
		dash = t1.indexOf("-");
		dash_2 = t1.lastIndexOf("-");
		
		t2 = t1.replace(t1.substring(dash+1, dash_2), star2);
		System.out.println(t2);
		
		
		// 모두 대문자로 변경
		t1 = "Hello World";
		t2 = t1.toUpperCase();
		System.out.println(t2);
		
		// 새로운 변수를 만들어서 입력해넣는 것과, replace(해당 char과 같은 값 전체 변경)
		
		t1 = "   Java   안녕   ";
		t2 = t1.trim();
		System.out.println(t2);
		
	}

}
