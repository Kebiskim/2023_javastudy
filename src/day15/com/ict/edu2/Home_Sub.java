//package day15.com.ict.edu2;
//
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class Home_Sub extends Home_Super {
//
//	public static void main(String[] args) {
//		
//		int num = 0; 
//		String n1 = numPlus.num;
//		
//		
//		public class Hw_HighLow {
//		   public static void main(String[] args) {
//
//		      Random ran = new Random();
//		      Scanner scan = new Scanner(System.in);
//
//		      String choice = ""; 
//		      int num_pre = 0;
//		      int win = 0; 
//		      int try_count = 0; 
//
//		      esc: 
//		         while (true) {
//		         int num = (int) (ran.nextInt(101));
//		         System.out.println("소주뚜껑 번호 맞추기 게임 시작!! >> 1. 0~100 사이 숫자를 입력하세요.");
//		         num_pre = scan.nextInt();
//		         System.out.println("소주뚜껑 번호 맞추기 게임 시작!! >> 2. UP 혹은 DOWN을 입력하세요.");
//		         choice = scan.next();
//		         if (choice.equalsIgnoreCase("UP") && num_pre > num) {
//		            System.out.println("정답은" + num + "!! 맞췄습니다.");
//		            try_count++;
//		            win++;
//		         } else if (choice.equalsIgnoreCase("UP") && num_pre < num) {
//		            System.out.println("정답은" + num + "!! 틀렸습니다.");
//		            try_count++;
//		         } else if (choice.equalsIgnoreCase("DOWN") && num_pre < num) {
//		            System.out.println("정답은" + num + "!! 맞췄습니다");
//		            try_count++;
//		            win++;
//		         } else if (choice.equalsIgnoreCase("DOWN") && num_pre > num) {
//		            System.out.println("정답은" + num + "!! 틀렸습니다");
//		            try_count++;
//		         } else {
//		            System.out.println("잘못 입력하셨습니다.");
//		            continue;
//		         }
//		         while (true) {
//		            double wins = 0;
//		            System.out.println("더 하시겠습니까? (y/n) ");
//		            String str = scan.next();
//		            if (str.equalsIgnoreCase("y")) {
//		               break;
//		            } else if (str.equalsIgnoreCase("n")) {
//		               wins = (int) ((win / (try_count * 1.0)) * 1000) / 10.0;
//		               System.out.println("총 시도 횟수는 " + try_count + " 맞춘 횟수는 " + win + "적중률은 " + wins + "퍼 입니다.");
//		               System.out.println();
//		               break esc;
//		            } else {
//		               System.out.println("잘못 입력하셨습니다.");
//		               continue;
//		            }
//		         }
//		      }
//		   }
//		}
//	}
//	
//}
