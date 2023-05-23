package day07.com.ict.edu2;

public class Quiz {
public static void main(String[] args) {
	
//	char k1 = str.charAt(8); // ★ 왼쪽에 미리 선언해야 하는 부분 & 랑 비슷하니까 꼭 주의하기!!
//	System.out.println("결과 : " + k1);
	
	String num = "010-9732-9110";
	String answer = "";
	
	for (int i = 0; i < 13; i++) {
		if (i > 3 && i < 8) {
			answer += "*";
		}
		else {
			answer += num.charAt(i);
		}	
	}
	System.out.println(answer);
	
	

	
	
	
	
	
	
	}
}
