package day09.com.ict.edu;

import java.util.Arrays;

public class Ex07_Array {
	public static void main(String[] args) {
		// 가장 작은값과 가장 큰 값 구하기
		int su[] = {90,87,-20,120,67,23,40,53};
		
		//오름차순
		Arrays.sort(su);
		
		System.out.println("가장 작은 값 : " + su[0]);
		System.out.println("가장 큰 값 : " + su[su.length-1]);	// index랑 배열 값이 1 차이 나므로, -1 해줌!!
	}
}
