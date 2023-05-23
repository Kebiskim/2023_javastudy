package day07.com.ict.edu2;

public class Ex02_String {
	public static void main(String[] args) {
		// String 클래스는 문자열을 처리하는 클래스
		// 기본자료형은 아니지만 기본자료형 처럼 사용
		// Shift + alt 2 눌러서 API 열기.
		
		// 괄호가 있으면 메서드
		// String에서 자주 사용되는 메서드들
		// 메서드(인자) : 실행 결과의 자료형
		// 인자 = 메서드가 실행하기 위해서 받은 재료 (source)
		// 1. charAt(int index) : char
		//		위치정보 = index를 받아서 해당 위치의 존재하는 글자를 char형으로 변환
		//		위치 정보를 받아서 해당 위치에 존재하는 글자를 char형으로 반환
		String str = "한국 ICT 인재개발원 1강의장";
		// 인덱스 => 16글자 (0 에서 16까지)
		char k1 = str.charAt(8); // ★ 왼쪽에 미리 선언해야 하는 부분 & 랑 비슷하니까 꼭 주의하기!!
		System.out.println("결과 : " + k1);
		char k2 = str.charAt(16);
		// 에러 : java.lang.StringIndexOutOfBoundsException:
		
//		double per = (int)(((double) 4/(double) 7 * 1000.0) / 10.0);
//        System.out.println("짝수확률 : "+ per + "퍼센트");
		
		// 모두 소문자로 만들자 (실제로는 이런 식으로 안 하는데, 배운 거 써먹기 위해 하는 것) 
		str = "Hello World"; // 인덱스로 봤을 때, 11자리 (0 ~ 10까지)
		// 대문자가 숫자가 더 작음 (A => 65)
		// 텍스트의 길이를 구해주는 메서드 있음 : length()
		// 밑에 11 대신, str.length(); 써주면 됨!! => str 문자열의 길이를 구해줌.
		
		for (int i = 0; i < 11; i++) {
			char k3 = str.charAt(i);
			if (k3 >= 'a' && k3 <= 'z') {
				System.out.print((char)(k3 - 32));	// char랑 int 계산하면 => 큰걸로 넘어가서, int 가 됨.  
			}else {
				System.out.print((char)k3);	// ★★ 그래서 형변환 해줘야 함!!!
			}
		}
		// 위에 건 java에서는 자주 안 씀! 한 글자라도, char 안 쓰고 String 으로 쓰는 편
		
		
		// 2. concat(String str) : String
		// 입력된 문자열을 현재 문자열과 합친다. ("문자열" + "문자열")
		System.out.println();
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);	// ★concat 사용법 타이핑해서 연습!!
		System.out.println(s3);
		System.out.println(s1 + s2);
		// 현업에서는 +도, concat도 쓰면 안 됨. 
		// 메모리 효율성을 위해서 String buffer or String builder 사용해야 함!!
		// 실제 현업에서는, 그래도 + 를 쓰고 있음!!
		
		
		// 3. contains(CharSequence s) : boolean
		// CharSequence = char 값을 읽을 수 있는 시퀀스, 인터페이스
		// CharSequence를 지금은 String이라고 생각하자. (class, 상속 배워야 이해할 수 있음) => 위에 String 이 들어가는 격.
		// 현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true, 없으면 false
		// ex) contains를 통해서, 게임할 때 욕하면 필터링해서 blur 처리하는 기능 등에서 사용!!
		
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));	// @ 를 포함하고 있는가? => true
		System.out.println(s4.contains("REA")); // => true
		System.out.println(s4.contains("rea")); // => false
		System.out.println("=======================");
		String st = "홍길동이길동김길동박길동";	// 슬라이싱(쪼개기)를 잘 해서 해야 함.
		
		
		// 4. equals(Object anObject) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false
		// String 은 절대 등호 두개 쓰면 안됨 (==) 같다 표시할 때. 대신 equals(대소문자까지 같은지 비교)랑 
		// equalsIgnoreCase(대소문자 무시) 사용.
		
		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별하지 않음)
		// 계속할까요? 할 때, Y 혹은 N 받을 수 있음. (y나 n도 가능)
		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));			 // => false
		System.out.println(s5.equalsIgnoreCase(s6)); // => true
		
		// 6. format(String format, Object... args) : static String
		// 형식을 지정하고 형식에 맞춰 생성
		String s7 = "ICT 인재개발원";
		// 문자열 => %s
		String s8 = String.format("%s", s7);
		System.out.println(s8);
		
		// %30s => 30자리 차지하는 문자열 (오른쪽 정렬 + 남은 자리는 비워둔다)
		String s9 = String.format("%30s", s7);
		System.out.println(s9);
		
		// %-30s => 30자리 차지하는 문자열 (왼쪽 정렬 + 남은 자리는 비워둔다)
		String s11 = String.format("%-30s", s7);
		System.out.println(s11);
		
		// 지정한 자릿수가 실제 글자 수보다 적어도 전체 글자는 다 나온다!!
		String s10 = String.format("%4s", s7); 
		System.out.println(s10);
		
		// 잘려서 나옴. (4자리까지만 나오고 자름, %가 아니라 자릿수를 뜻함)
		String s12 = String.format("%.4s", s7);
		System.out.println(s12);
		
		// %d => 정수형식 지정		==> 2314**
		int s13 = 2314;
		s8 = String.format("%d**", s13);
		System.out.println(s8);
		
		// 오른쪽 정렬
		s13 = 2314;
		s8 = String.format("%5d", s13);
		System.out.println(s8);
		
		// 왼쪽 정렬
		s13 = 2314;
		s8 = String.format("%-5d", s13);
		System.out.println(s8);
		
		// 오른쪽 정렬 (빈 공간은 0으로 채움)
		s13 = 2314;
		s8 = String.format("%05d", s13);
		System.out.println(s8);
		
		// 오른쪽 정렬 (빈 공간은 0으로 채움) => 세자리수마다 , 들어가는 것!
		s13 = 231412312;
		s8 = String.format("%,d", s13);
		System.out.println(s8);
		
		// %f => 실수형식 지정
		double s14 = 1245.45547954;
		// 기본 form
		System.out.println(String.format("%f", s14));
		System.out.println(String.format("%20f", s14));
		// 소수점 셋째자리까지 (반올림)
		System.out.println(String.format("%.3f", s14));
		System.out.println(String.format("%.1f", s14));
		// 정밀한 계산은 반올림처리 하면 안됨 (★★★허가가 있어야 함!!)
		System.out.println(String.format("%,.1f", s14));	// => 자릿수 나누고, 소숫점 1번째 자리까지 
		
		
		System.out.println("==============================");
		// 7. getBytes() => byte[] 배열로 나옴 (byte는 숫자)
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력할 때 사용한다. (대/소문자, 숫자, 일부 특수문자만 가능(아스키코드), 영어를 제외한 글자 안됨)
		// 숫자로 문자를 기억하는 것이 byte코드로 기억하는 것 (A => 65 등)
		String a1 = "java";
		byte[] b1 = a1.getBytes();
		System.out.println(b1[0]);	// j의 숫자  ★ 단순 b1 출력이 아닌, b1의 "인덱스"를 출력해야 함!!
		System.out.println(b1[1]);	// a의 숫자
		System.out.println(b1[2]);	// v의 숫자
		System.out.println(b1[3]);	// a의 숫자
		// 문자를 보내는 것보다, 숫자를 보내는 것이 편하기 때문에 (컴퓨터 입장에서), 위와 같은 변환 사용.
		// getChar 보다 getBytes 쓰는 이유 => 영어가 속도가 빠르기 때문. 부득이하게 한글이 섞여 있을 경우, getChar 써야함.
		System.out.println("==============================");
		// 배열과 for문은 떨어질 수가 없음!!
			
		// for + ctrl + space 했을 때 b1.length로 자동으로 들어감!! (위에서 찾아서)
		for (int i = 0; i < b1.length; i++) {
			System.out.print((char)(b1[i]));
		}		
		
		System.out.println("==============================");
		// 8. hashCode() : int
		// 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
		// String hashCode는 각 문자열에서 한 글자씩 가지고 와서 정수값으로 변경

		String a2 = "홍길동";
		System.out.println(a2.hashCode());
		
		String a3 = "홍길동";
		System.out.println(a3.hashCode());
		// ▲ 같은 글자의 해시코드는 동일함! (a2도 "홍길동"을 가지고 있고, a3도 "홍길동"을 가지고 있음)
		// 추가로 새로 만들지 않음!! JVM이 알아서, 중복으로 만들지 않도록 관리함!
		
		// 문자열일 때 == 는 주소가 같은지를 물어보는 것!!
		// String에서는 == 쓰지 않는 이유 (대신 equals 혹은 equalsIgnoreCase 사용함)
		System.out.println(a2 == a3);
		
		// equals의 경우, 문자열일 때, 내용이 같은지를 물어보는 것!!
		System.out.println(a2.equals(a3));
		
		// 9. indexOf(int ch), indexOf(String str) : int
		// int ch => 캐릭터를 집어넣는 것!!, 왼쪽 거는 char, 오른쪽 거는 String을 넣는다는 말. 넣으면 위치를 찾아줌.
		// 느낌상, charAt의 반대!! (charAt은 위치를 주면 글자를 끄집어 냄, indexOf는 'a'를 찾아 하면 위치값 나옴!!
		// charAt <=> indexOf
		// 입력된 char, String을 해당 문자열에 char나 String의 위치값을 알려준다.
		// 찾는 문자 or 문자열이 없으면, -1 반환.
		String a4 = "BufferedReader";
		
		// ★ 아래 세 가지는, 글자가 하나이므로, char를 찾는 것!!
		// 'R'를 찾아라
		System.out.println(a4.indexOf("R"));
		// 'r'을 찾아라
		System.out.println(a4.indexOf("r"));
		// 'K'를 찾아라
		System.out.println(a4.indexOf("K"));	// 없기 때문에, -1 반환!!
		// 'er'을 찾아라
		System.out.println(a4.indexOf("er"));	// 문자열은 ' ' 사이에 넣으면 오류 남!! 무조건 " " 사용.
		// 한번 찾고 나면 이후 글자는 못 찾음 (한개 찾으면 끝!!)
		// ★단어를 찾을 때의 위치값은, 단어의 시작 위치와 동일!!
		// 띄어쓰기도 찾아줌!!
		// contains는 없으면 검색을 아예 안 함! 포함 여부부터 파악한다!! 없으면 찾기 시작을 안함.
		
		// "슬라이싱" 잘하면(파이썬에서 특화, 파싱 이라고 함), 웹 크롤링을 잘할 수 있고! 
		// 구문 분석을 잘할 수 있으면, 빅데이터 처리에 유용!! 
		
		
		// 카카오 ask 어쩌구 -> AI 모델 있음. ChatGpt에서 현재 대통령 물어보면 문재인으로 나옴. (최종 data 2021년 9월)
		
		
		System.out.println("=========================");
		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 	   입력된 char, String을 해당 문자열에 char나 String의 마지막 위치값을 알려준다.
		//	   'R'를 찾아라
		System.out.println(a4.lastIndexOf('R'));
		//	   'r'를 찾아라
		System.out.println(a4.lastIndexOf('r'));
		//	   'K'를 찾아라
		System.out.println(a4.lastIndexOf('K'));
		//	   "er"를 찾아라		
		System.out.println(a4.lastIndexOf("er"));
		
		// 11. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 2번째, 3번째 문자나 문자열 찾기 위함
		// fromIndex => 시작 위치값
		System.out.println(a4.indexOf('e', 0));		// 'e'라는 문자를, 처음(시작위치)부터 찾겠다는 뜻. (a4.indexOf('e')와 같은 내용)
		
		// 첫번째 'e'의 위치가 4로 나왔다. => 두번째 e는 5부터 시작하는 것.
		// 두번째 'e' 찾기
		System.out.println(a4.indexOf('e', 5));
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0) + 1));
		// 숫자를 direct로 넣는다기 보다, 변수로 집어넣기를 선호함!!
		// 세번째 'e' 찾기
		System.out.println(a4.indexOf('e', a4.indexOf('e', a4.indexOf('e', 0) + 1) + 1));
		// 네번째 'e' 찾기
//		System.out.println(a4.indexOf('e', 'e', a4.indexOf('e', a4.indexOf('e', 0) + 1) + 1) + 1));
		
		// 기획을 잘하면 두번째, 세번째 indexOf 안쓰게 할 수도 있음 => 기획을 어떻게 하느냐가 더 중요함!!
		// (이를 아키텍처(architecture)라고 부름!)
		
		// 12. ★ length() : int => 문자열의 길이(갯수) => 1부터 시작 (갯수를 셀 때는 0부터 안 세기 때문에)
		// 						 문자열의 위치(index) => 0부터
		System.out.println(a4.length());
		
		// 13. replace(char oldChar, char newChar) : String
		//	   replace(String oldStr, char newStr) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다. => 비속어 나왔을 때 xxx 처리 하는 것 등
		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("한", "한 ♥ "); 	// 한글자에서 여러글자 바꿀 때는 둘다 쌍따옴표 => 헷갈리면 둘다 쌍따옴표	
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		// a5는 안 바뀌고, s6에만 새로 저장하는 것.
		
		

	
	}
}