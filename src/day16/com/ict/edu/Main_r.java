package day16.com.ict.edu;

import java.util.Scanner;

public class Main_r {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Choice_r choice = new Choice_r();
	        Setvol_r setvol = new Setvol_r();

	        // 장치 선택하기
	        int vol = 3;
	        while (true) {
		        while(true) {
		        	vol = setvol.getVol();
		            System.out.println("======= 장치를 선택하세요 =======");
		            System.out.println("1. TV | 2. 컴퓨터 스피커 | 3. 이어폰");
		            int su = scan.nextInt();        // 장치 선택하기
		            setvol.setSu(su);
		            System.out.println();
		            choice.chooseMachine(su, vol);
		            choice.getVol();
		            break;
		            }
		        setvol.setVol(vol);
	        } // 외측 while문 종료
	        // 볼륨 설정하기
		}
}
