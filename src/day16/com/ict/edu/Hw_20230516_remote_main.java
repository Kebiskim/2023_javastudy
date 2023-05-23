package day16.com.ict.edu;
import java.util.Scanner;

public class Hw_20230516_remote_main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hw_0516_Remote_Choice choice = new Hw_0516_Remote_Choice();
        Hw_0516_Remote_Setvol setvol = new Hw_0516_Remote_Setvol();

        // 장치 선택하기
        int vol = 3;
        while (true) {
	        while(true) {
	        	vol = setvol.getVol();
	            System.out.println("======= 장치를 선택하세요 =======");
	            System.out.println("1. TV | 2. 컴퓨터 스피커 | 3. 이어폰");
	            int su = scan.nextInt();        // 장치 선택하기
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
