package day16.com.ict.edu;

import java.util.Scanner;

public class Hw_0516_Remote_Setvol {
	
	Scanner scan = new Scanner(System.in);
	
	private int vol = 3;
	
	public void setVol(int vol) {
	esc2:
	while(true) {
		while(true) {
	    	if(vol<=0 || vol>=10) {
	            System.out.println("볼륨 설정이 불가합니다.");
	            continue esc2;
	    	}
	        System.out.println("======= 볼륨을 설정합니다 ======="); 
	        System.out.println("1. 볼륨 up | 2. 볼륨 down | 3. 종료");
	        int num = scan.nextInt();
	        switch(num) {
	        case 1 : vol++;  
	        System.out.println("현재 볼륨은 "+vol+"입니다.");break;
	        case 2 : vol--;
	        System.out.println("현재 볼륨은 "+vol+"입니다."); break;
	        case 3 : System.out.println("종료합니다."); break esc2;
	        default : System.out.println("다시 입력하세요"); break esc2;
	        }
	        this.vol = vol;      	
	        }
		}
	}

	public int getVol() {
		return vol;
	}
	
	
	
	
}
