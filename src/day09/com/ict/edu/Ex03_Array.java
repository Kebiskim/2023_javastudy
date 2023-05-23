package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {
	public static void main(String[] args) {
		// 정렬하기
		
		int[] su = {3,4,9,8,2,1,7,10,5,6};
		
		// 자리변경을 위한 임시변수 필요
		int tmp = 0;
		
		for (int i = 0; i < su.length-1; i++) {		// 나 : 바깥쪽 for문		끝보다 -1까지 가되, 시작은 i
			for (int j = i+1; j < su.length; j++) {	// 비교대상 : 안쪽 for문	끝까지 가되, 시작은 i+1
				// 비교하기 (오름(i>j), 내림(i<j)) 때 자리변경 하자. (오름, 내림 차이는 부호 방향만)
				if (su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
					
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}
		
		
		int[] su2 = {3,4,9,8,2,1,7,10,5,6};
		
		// Arrays 클래스는 배열 복사, 정렬, List로 전환 등
		// 배열에 관련된 기능을 제공하는 클래스
		// 오름차순 정렬은 sort() 로 가능
		// ★내림차순은 없음!!
		
		System.out.println("****************************");
		// String 배열도 가능, 순서는 숫자, 영문, 한글 순??? 
		Arrays.sort(su2);
		for (int i = 0; i < su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println();
		System.out.println("****************************");
		
		// 내림차순 하는 법!!
		// 내림차순 할 때 주의사항!! ▼▼▼
		// 기본자료형으로는 오류 발생 => int를 Integer로 변경해줘야 함. double 도 Double로. String 은 똑같음.
		Integer[] su3 = {13,14,19,18,12,11,17,20,15,16};
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i] + " ");
		}
		
		System.out.println("****************************");
	}
}