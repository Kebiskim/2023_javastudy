package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuilder {
	public static void main(String[] args) {
		// 문자열을 추가할 때 사용 (메모지 주소가 변경되지 않는다.)
		// 추가할 때 append() 사용
		// 빌더, 버퍼를, 내용을 추가할 때는 구분없이 사용해도 됨!! (차이 크게 없음??)
		// toString() => String 전환한다.
		StringBuffer sb = new StringBuffer("ictedu");
		// 추가
		sb.append(" 대한민국");
		
		System.out.println(sb);
		// StringBuffer에서 String 변환할 때, toString 붙여서 쓰는 것이 일반적!!
		System.out.println(sb.toString());
		
		// StringTokenizer : 문자열 분리, split과 비슷한데, 차이점으로는, 배열의 크기를 지정 못함.
		// 					구분자가 없으면 (띄어쓰기, 탭, 줄바꾸기 기준)
		// nextToken()을 이용해서 문자열 분리 
		
		// split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// regex => 구분자(나눌 기준), limit => 배열의 크기 (방의 갯수)
		// substring : 위치를 지정해서 글자를 쪼개는 것.
		
		// ★ 갯수가 지정되어 있지 않기 때문에 while문으로 아래처럼 진행하는 경우 자바에 종종 있음.
		// 다음 것이 있는지 물어보는 것!!
		String str = "사과 바나나 망고 오렌지 수박";
		str = "사과, 바나나,망고,오렌지,수박";
		// 아래처럼 구분자 달면 해당 구분자 기준으로 나눔!! 
		// split과 다른 점은 크기 지정 못함.
		StringTokenizer st = new StringTokenizer(str, ",");
		// 다음 요소가 있는가 (hasMoreElements()), 있으면 다시 진행
		while (st.hasMoreElements()) {
			// nextToken -> 다음 요소를 끄집어내라.
			// 끄집어 내오면서, 검사자가 "사과 앞부분 에서, 다음으로 옮겨감. 차례차례 res에 들어감.
			String res = st.nextToken();
			System.out.println(res);
		}
		System.out.println();
		
		// 강사님의 경우 split을 주로 썼음. 추천하는 방법은 이것!! 배열 쓰는 것이 나음.
		// 위의 것의 경우에는 배열이 아니라서 처리하기 좀 까다로움.
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
