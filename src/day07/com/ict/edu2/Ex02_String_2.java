package day07.com.ict.edu2;

public class Ex02_String_2 {
	public static void main(String[] args) {
		
		// 이름의 첫자와 마지막 자를 제외하고 * 찍기
		// 예) 홍길동 => 홍*동, 선우은숙 => 선**숙
		String a8 = "홍홍홍감감감감김김김";
		int t1 = a8.length();
		String res = "";
		for (int i = 0; i < t1; i++) {
			char s = a8.charAt(i);
			if(i == 0 || i == t1-1) {
				res += s;
			}else {
				res += "*";
			}
		}
		System.out.println("결과 : " + res);
		
	
		// 전화번호 : 010-9876-7410 => 010-9876-****, 010-****-7410으로 변경하기
		a8 = "010-9732-9110";
		int t2 = a8.length();
		int t3 = a8.lastIndexOf("-"); // => 8
		
		res = "";
		for (int i = 0; i < t2; i++) {
			char s = a8.charAt(i);
			if (i>=0 && i<=t3) {
				res += s;
			}else {
				res += "*";
			}
		}
		System.out.println(res);

		
		a8 = "010-9732-9110";
		t2 = a8.length();
		t3 = a8.lastIndexOf("-"); // => 8
		int t4 = a8.indexOf("-");
		
		res = "";
		for (int i = 0; i < t2; i++) {
			char s = a8.charAt(i);
			if (i>t4 && i<t3) {
				res += "*";
			}else {
				res += s;
			}
		}
		System.out.println(res);
		// ★ 포인트는 : 값을 꺼내와서 [새롭게 찍어주는(출력하는) 것!!]
		
		
		// 14. isEmpty() : boolean 
		// 해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());
		
		t5 = "";
		System.out.println(t5.isEmpty());
		
		System.out.println("==============================");
		// 자바에서 []는 배열이란 뜻
		// 15. split(String regex) : String[] (regex => regular expression)
		//	   split(string regex, int limit) : String[]
		// regex => 구분자(나눌 기준), limit => 배열의 크기 (방의 갯수)
		t5 = "사과, 딸기, 망고, @오렌지, 두리안, 용과";
		// 변수 t5를 부르면 => 값 (위에 사과 어쩌구) 전체가 온다.
		String[] arr = t5.split(",");
		// , 을 기준으로 여러 개의 방으로 나눠져서 하나씩 들어간다. (방 번호 => index)
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);	// => 오렌지
		}
		// limit 가 없으면 , 기준으로 계속 자름 => 방 크기를 (limit)를 정해주면 방을 먼저 정하고, 
		// 첫 방에 1번째, 두 번째 방에 2번째, 나머지는 마지막 방에 다 던져 넣음. 
		// 배열은 크기가 안 맞는 것을 불러오면 무조건 오류 => arr[6] 은 무조건 오류 발생!!
		// 요구사항이나 환경이 바뀔 때, 매번 다 바꿔야만 하기 때문에 변수 말고 직접 값을 넣는 것은 지양하기!!
		
		System.out.println("==============================");
		String[] arr2 = t5.split(",", 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		// 쓸일 있긴 한데, 뒤에 더 좋은 것 배움!!
		
		// 16. substring(int beginIndex) : String
		// 	   입력된 시작위치부터 끝까지 문자열 추출
		// 시작위치를 정해주면, ★ 시작 위치부터 끝까지만 나오고 앞에 부분은 잘라버림!!
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);
		System.out.println(t7);
		
		t7 = t6.substring(9);
		System.out.println(t7);
		
		t7 = t6.substring(t6.lastIndexOf("-")+1);
		System.out.println(t7);
		
		// 16-2 substring(int beginIndex, int endIndex) : String
		// beginIndex 위치부터 endIndex 위치까지 (endIndex 위치는 포함하지 않는다.)
		
		t6 = "010-9732-9110";
		t7 = t6.substring(4, 8);	// 마지막 숫자는 포함하지 않기 때문!! 파이썬 for i in range(5, 12):  이랑 똑같음!!
		// ▲ 8에서 4 빼면 네글자 => 숫자 네개가 나옴.
		System.out.println(t7);
		
		// 첫글자 추출
		t7 = t6.substring(0, 1); // => 숫자 하나가 나옴 (몇개 뽑았는지)
		System.out.println(t7);
		
		// 관리자 페이지에 가장 먼저 나오는 것 => 대시보드 (사이트의 기본적인 것을 보게 해 주는 것(메인화면), 통계같은 것이 나옴)
		
		// 010-9732-9110 => 010-****-9110, 또는 010-9732-****
		String t8 = "010-9732-9110";
		String t9 = "****";
		System.out.println();
		String t10 = t8.replace(t8.substring(4, 8), t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(t8.indexOf("-")+1, t8.lastIndexOf("-")), t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(t8.lastIndexOf("-")+1), t9);
		System.out.println(t10);
		
		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);		
		System.out.println(arr3[1]);		
		System.out.println(arr3[2]);
		
		System.out.println(arr3[0] + "-****-" + arr3[2]);
		System.out.println(arr3[0] + "-" + arr3[1] + "-****");
		
		// 예전에는 관리자가 비밀번호 알아낼 수 있었음. (지금은 알아내게 하면 잘못된 로직)
		// 이름, 주민번호, 메일 등은 별 찍어서 일부만 보이게 해야 함!! (프로젝트 할 때도 주의!!)
		// 쇼핑몰도 나라에서 인증마크 줄 때 검사함!!
		// 오라클 sysdata => 끄집어내면 연 월 일 시 분 초 까지 다 나오는데, substring(0, 1) 써서 일 까지만 나오도록!!
		
		// 17. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		// 	   toUpperCase() : String => 해당 문자열을 모두 대문자로 변경
		// 실제로는 아래처럼 안 함!!! ▼▼▼ (C 하는 사람은 만들어서 씀)
		String str1 = "javaLand03Exam";
		String str2 = "";
		for (int i = 0; i < str1.length(); i++) {
			char k = str1.charAt(i);
			// 다 대문자 만들기
			// 소문자 => 대문자로 변경
			if (k>='a' && k<='z') {
				str2 = str2 + (char)(k-32);	// char 형변환 부분 체크!!
			}else {
				// 나머지는 그대로 출력
				str2 = str2 + k;
			}
		}	
		System.out.println(str2);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		// DB에서는 대문자를 구분하지 않으나, 조건에서는 구분함!! 조건에서 대소문자 틀리면 답이 안 나오기 때문
		// (★ 오류가 아니라, 답 자체가 안 나옴!!)
		
		// 18. toString : String
		// 객체(클래스)에서 toString : 모든 클래스(객체)에서 사용 가능한 메서드.
		//							클래스(객체)가 가지고 있는 정보나 값(data)들을 문자열로 만들어서 반환 
		// String 에서의 toString  : 문자열 자체 반환. => 잘 안씀. 주로 다른 클래스에서 내용 끄집어내려고 씀 (위에 개념)
		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		System.out.println(u1);
		System.out.println(u2);
		
		System.out.println(u1.equals(u2)); // => true
		
		// 19. trim() : String
		// 해당 문자열의 앞, 뒤 공백 제거, 글자 사이의 공백은 제거 못함.
		String u3 = "   java    자바    JAVA   ";
		System.out.println("길이 : " + u3.length());		// => length는 갯수니까 1부터 카운팅 시작!!
		
		String u4 = u3.trim();
		System.out.println("길이 : " + u4.length());		// => length는 갯수니까 1부터 카운팅 시작!!
		
		// 20. startsWith(String prefix) : boolean   	   => 최근에 많이 씀!! (예전에는 substring 썼음)
		//	   주어진 문자열로 시작하는지 검색 (문자는 char, 문자열은 String)
		
		//	   startsWith(String prefix, int toffset) : boolean
		// 주어진 문자로 시작하는지 검사, toffset => 시작 위치
		
		// endsWith(String suffix) : boolean
		// 주어진 문자로 끝나는지 검사 => 파일명 받았을 때 jpg로 끝나는지, png로 끝나는지.. 등등 확인 가능 (확장자)
		String u5 = "java   자바   JAVA 11111111";
		System.out.println(u5.startsWith("JAVA")); // => false
		System.out.println(u5.startsWith("java")); // => true
		System.out.println(u5.startsWith("자바"));  // => false
		
		System.out.println(u5.endsWith("JAVA")); // => false
		System.out.println(u5.endsWith("java")); // => false
		System.out.println(u5.endsWith("자바"));  // => false
		
		// 21. valueOf(기본자료형) : 들어온 기본 자료형을 String으로 변경
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37L;  // L 붙이기
		double num3 = 345.127;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("=================");
		
		System.out.println(bo1);
		System.out.println(ch1+1); // => a 에서 98로 바뀜.
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println("=================");
		
		// 문자처럼 해서 더해버림 (문자 + 숫자 더했을 때와 같은 현상) 
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		
		// 실제로는 쓰기 귀찮아서, ★아래와 같이 씀!! (메모리 값은 세가지를 차지 => 가비지 라고 부름)
		System.out.println(bo1+""+1);
		System.out.println(ch1+""+1); // => a 에서 98로 바뀜.
		System.out.println(num1+""+1);
		System.out.println(num2+""+1);
		System.out.println(num3+""+1);
		System.out.println("=================");
		
		// 웹의 정보는 다 String형으로 들어옴. => String 으로 들어오는 숫자를 숫자형으로 변경하는 부분들.
		
		// 22. Wrapper Class
		// 	   기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
		// 22-1. "true" 또는 "false" => 진짜 true나 false로 바꿈 : Boolean.parseBoolean()
		String msg = "false";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg);	// true;
		System.out.println(msg2);	// true;
		if(msg2) {						 // msg 넣으면 텍스트라서 오류, msg2 넣으면 실제 boolean 형이라서 가능.
			System.out.println("변경1");
		}else {
			System.out.println("변경2");			
		}
		
		// 22-2. "142", "25" => 142, 25 => Integer.parseInt() => 문자형 숫자를 진짜 숫자로 바꿔 줌.
		msg = "142";
		int msg3 = Integer.parseInt(msg); // 142
		System.out.println(msg + 10);     // 14210
		System.out.println(msg3 + 10);	  // 152
		
		// Q. 메서드 중에서, 메서드 입력 후 괄호 안에만 변수가 들어가는 메서드와, 변수. 메서드 (""); 이런 식으로 들어가는 메서드
		// 차이점은, 
		// str1.toUpperCase()
		// int3.Integer.parseInt() ??  		// Integer.parseInt(msg)
		// String u2 = u1.toString();

		
		// 22-3. "123213", "3423423" => 123213, 3423423 => Long.parseLong();
		//		 "숫자" => OK, "숫자L" => err
		msg = "123123123123123"; // => err   // 뒤에 L 붙이면 => Error : java.lang.NumberFormatException
		long msg_4 = Long.parseLong(msg);
		System.out.println(msg+9);
		System.out.println(msg_4+9);
		
		// 22-4. "347.457" => 347.457 => Double.parseDouble()
		msg = "347.457f";  // => f 붙여도 오류 안 남 (L과 다르게)
		double msg5 =  Double.parseDouble(msg);
		System.out.println(msg+0.04);
		System.out.println(msg5+0.04);
		
		msg = "347.457f";  // => f 붙여도 오류 안 남 (L과 다르게) => 하지만 float는 쓸 일이 없음!!!
		msg5 =  Double.parseDouble(msg);
		System.out.println(msg+0.04);
		System.out.println(msg5+0.04);
		
		// 소숫점 자리는 회사에서 써야하는 때까지만 남기고, 끊어버려야 함!!
		// parseChar()는 없음 (String에 charAt()이 있으므로!)
		
		// 22-5. Character.parseCharacter()는 존재하지 않는다.
		//		 String의 charAt()을 이용하면 char를 가져올 수 있다.
		msg = "p";
		char msg6 = msg.charAt(0);
		
		System.out.println("===========================");
		msg = "java 자바 JAVA 대한민국 2023 %*";
		// String.getBytes() => byte[]	(영문자 대/소문자, 숫자 및 일부 특수문자만 가능)
		byte[] result = msg.getBytes();
		
		// char는 저장할 때 숫자로 저장함!!
		for (int i = 0; i < result.length; i++) {			// msg.length가 아니라 result.length (byte 배열)
			System.out.println(result[i] + " : " + (char)(result[i]));
		}
		// 띄어쓰기는 ASCII 코드로 32 임.
		// 위 코드 출력 시, 한글 부분이 숫자 -로 나옴.
		
		// String.toCharArray() => char[] 모든 문자 처리 가능.
		// 숫자, 영문으로만 이뤄졌다 => getBytes() 사용, 아닐 경우 toCharArray() 사용.
		char [] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {	// 배열의 경우에는 length 뒤에 () 안붙임.
			System.out.println(result2[i]);
		}
		
		// 
		
		
		
		
	}
}