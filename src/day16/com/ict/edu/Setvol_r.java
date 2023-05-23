package day16.com.ict.edu;

import java.util.Scanner;

public class Setvol_r {
		
		Scanner scan = new Scanner(System.in);
		TV_r tv = new TV_r();
		Com_r com = new Com_r();
		Ear_r ear = new Ear_r();
		int su = 0;
		
		public int getSu() {
			return su;
		}

		public void setSu(int su) {
			this.su = su;
		}

		private int vol = 3;
		
		public void setVol(int vol) {
		esc2:
		while(true) {
			while(true) {
		    	if(vol<=0 || vol>=10) {
		            System.out.println("볼륨 설정이 불가합니다.");
		            System.out.println("계속하려면 '계속'을 입력하세요");
		            String cont = "";
		            cont = scan.next();
		            if (cont.equalsIgnoreCase("계속"))
		            	System.out.println("볼륨 설정 창으로 되돌아갑니다.");
		            else
		            	continue;
		    	}
		        System.out.println("======= 볼륨을 설정합니다 ======="); 
		        System.out.println("1. 볼륨 up | 2. 볼륨 down | 3. 종료");
		        int num = scan.nextInt();
	        	if (su == 1) {
	    			vol = tv.getVol();
	    		}else if (su == 2) {
	        		vol = com.getVol();
	    		}else if (su == 3)
	    			vol = ear.getVol();
		        switch(num) {
		        case 1 : vol++;  
		      	if (su == 1) {
	        		tv.setVol(vol);
	        	}else if (su == 2) {
	        		com.setVol(vol);
	        		System.out.println(com.getVol()); 
	        	}else if (su == 3) {
	        		ear.setVol(vol);
	        	}
		        System.out.println("현재 볼륨은 "+vol+"입니다.");break;
		        case 2 : vol--;
		      	if (su == 1) {
	        		tv.setVol(vol);
	        	}else if (su == 2) {
	        		com.setVol(vol);
	        		System.out.println(com.getVol()); 
	        	}else if (su == 3) {
	        		ear.setVol(vol);
	        	}
		        System.out.println("현재 볼륨은 "+vol+"입니다."); break;
		        case 3 : System.out.println("종료합니다.");
		        	if (su == 1) {
		        		tv.setVol(vol);
		        	}else if (su == 2) {
		        		com.setVol(vol);
		        		System.out.println(com.getVol()); 
		        	}else if (su == 3) {
		        		ear.setVol(vol);
		        	}
		        	break esc2;
		        default : System.out.println("다시 입력하세요"); break esc2;
		        }
		        this.vol = vol;      	
		        } // 안쪽 while 문의 끝
			} // 바깥 while문의 끝
		} // setVol 메서드의 끝

		public int getVol() {
			return vol;
		}
}
