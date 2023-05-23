package day09.com.ict.edu;

public class Ex05_Array {
	public static void main(String[] args) {
		String name[] = {"홍", "김", "이", "박", "고"};
		int kor[] = {80,90,80,70,100};
		int eng[] = {85,95,75,85,95};
		int math[] = {100,95,90,100,100};
		// [0] => "홍", 80, 85, 100 이란 뜻.
		// 값이 다 들어가있다는 전제 하에 작성하는 아래 코드들!
		
		int sum[] = new int[name.length];
		double avg[] = new double[name.length]; // [] 안에 배열 칸 수
		String hak[] = new String[name.length];
		int rank[] = {1,1,1,1,1};
		
		// 총점 구하기
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(sum[i]);
		}
		
		// 평균 구하기
		for (int i = 0; i < name.length; i++) {
			avg[i] = ((int)(sum[i]/3.0 * 10) / 10.0);
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(avg[i]);
		}
		
		// 학점 구하기
		for (int i = 0; i < name.length; i++) {
			if (avg[i] >= 90)
				hak[i] = "A학점";
			else if (avg[i] >= 80)
				hak[i] = "B학점";
			else if (avg[i] >= 80)
				hak[i] = "C학점";
			else
				hak[i] = "F학점";
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(hak[i]);
		}
		
		// 등수 구하기
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if (avg[i] == avg[j]) continue;
				else if (avg[i] < avg[j])
					rank[i]++;
			}
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(rank[i]);
		}
		
//		// 순위를 구하자 (sum을 기반으로)
//		for (int i = 0; i < sum.length; i++) {
//			for (int j = 0; j < sum.length; j++) {
//				if (sum[i] == sum[j]) continue;
//				else if (sum[i] < sum[j])
//					rank[i]++;
//			}
//		}
//		
		
		// 출력
		System.out.println("***********************");
		System.out.println("이  름\t총  점\t평  균\t학  점\t순  위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i] + "\t");
			
			
		}
	
		
		
	}
}