package day15.com.ict.edu2;

import java.util.Random;
import java.util.Scanner;

public class Homework_20230516_main {
	public static void main(String[] args) {
		
//		String tv = "TV";
		int tv = 1;
		int speaker = 2;
		int earphone = 3;
		int machine_select = 0;
		int volume_updown = 0;
		int current_volume = 0;
		int tv_volume = 0;
		int speaker_volume = 0;
		int earphone_volume = 0;
		int count = 0;

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		tv_volume = ran.nextInt(11);
		speaker_volume = ran.nextInt(11);
		earphone_volume = ran.nextInt(11);
		
		// 아래에서 조정된 최종 볼륨값을 각 머신들에 저장해야 함.
		
		// 볼륨조절할 장치 선택
		while (true) {
			System.out.println("볼륨조절할 장치를 선택하세요 : >> 1. TV, 2. 스피커, 3. 이어폰");
			machine_select = scan.nextInt();
			if (machine_select == 1) {
				System.out.println("TV의 현재 볼륨은 : " + tv_volume + "입니다.");
			} else if (machine_select == 2) {
				System.out.println("스피커의 현재 볼륨은 : " + speaker_volume + "입니다.");
			} else if (machine_select == 3) {
				System.out.println("이어폰의 현재 볼륨은 : " + earphone_volume + "입니다.");
			} else {
				System.out.println("제대로 입력하세요!!");
				continue;
			}
			// 각 기기들의 볼륨(최초 랜덤값)을 변수에 저장.
//			if (count == 0) {
			current_volume = tv_volume;
			current_volume = speaker_volume;
			current_volume = earphone_volume;
//			}
//			count++;
			// 소리 조절하기
			volume_set:
			while (true) {
				while (true) {
					System.out.println("볼륨 UP은 1 입력, DOWN은 2 입력, 종료는 3번 입력");
					volume_updown = scan.nextInt();
					if (volume_updown == 3){
						System.out.println("볼륨 조절을 종료합니다.");
						break volume_set;
					}if (volume_updown == 1 && current_volume < 10) {
						System.out.println("볼륨을 1만큼 올립니다.");
						current_volume++;
						System.out.println("현재 볼륨 : " + current_volume);
					}else if (volume_updown == 2 && current_volume > 0) {
						System.out.println("볼륨을 1만큼 내립니다.");
						current_volume--;
						System.out.println("현재 볼륨 : " + current_volume);
					} else {
						System.out.println("제대로 입력하세요!!");
						System.out.println("현재 볼륨 : " + current_volume);
						continue;
					}
					if (current_volume == 10 || current_volume == 0) {
						System.out.println("★★★볼륨 조절치 한계에 도달했습니다. (최대 10, 최소 0)★★★");				
						System.out.println("현재 볼륨: " + current_volume);
						break;
					}
				} // 1차 while문의 끝
				if (machine_select == 1)
					tv_volume = current_volume;
				if (machine_select == 2)
					current_volume = speaker_volume;
				if (machine_select == 3)
					current_volume = earphone_volume;
			} // 2차 (소리 조절) while문의 끝
		} // 3차 (장치 선택) while문의 끝
		

		
	}
}
