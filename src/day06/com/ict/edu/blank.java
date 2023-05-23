package day06.com.ict.edu;

import java.util.Scanner;

public class blank {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 나라를 입력하면 수도가 출력되게 하자.
				// 한국 -> 서울 , 중국 -> 베이징 , 일본 -> 도쿄 , 미국 -> 워싱턴
				// (switch~case)
				System.out.println("------------------------------------------");
				System.out.print("나라 : ");
				String nara = scan.next();
				String sudo = "";

				for (int i = 0; true; i++) {
					switch (nara) {
					case "한국":
						sudo = "서울"; break ;
					case "중국":
						sudo = "베이징"; break ;
					case "일본":
						sudo = "도쿄"; break ;
					case "미국":
						sudo = "워싱턴"; break ;
					default:
						System.out.println("다시입력하십시오");
						nara = scan.next();
					}
					System.out.println(nara + "의 수도는 " + sudo + "입니다."); break;
				}
//		
//		int starCount = 4;
//	    int spaceCount = 0;
//	    String star = "*";
//	    String space = " ";
//
//	    for(int i = 1 ; i <= starCount; i++) {
//	        spaceCount = starCount -i;
//
//	        for(int j = 1 ; j <= i; j++) {
//	            System.out.print(star);
//	        }
//	        for(int k = 1 ; k <= spaceCount; k++) {
//	            System.out.print(space);
//	        }
//	        System.out.println();
//	    }
//
//	    System.out.println();
//
//	    for (int i = 1; i <= starCount; i++) {
//	        spaceCount = starCount - i;
//	        for (int j = 1; j <= spaceCount; j++) {
//	            System.out.print(space);
//	        }
//	        for (int k = 1; k <= i; k++) {
//	            System.out.print(star);
//	        }
//	        System.out.println();
//	}
//	
//	
//	    // (5 번) - * for문
//        // 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
//        // 몇까지 더해야 총합이 100이상이 되는지 구하시오.
//            int sum = 0;
//            for (int i = 1; i<500; i++) {
//                if (i % 2 == 1) {
//                    sum = sum + i ;
//                    if(sum<101&&sum>=100) {
//                        System.out.println("합한결과:"+sum);
//                        System.out.println("마지막더한숫자는:"+i+"입니다");
//                    }
//                } else { 
//                    sum = sum + (i * -1);
//                }
//            }
//	    
//         
//            
//            System.out.println("------------------------------------------");
//            int p = 2;
//            money = 10000;
//            int don = 0;
//            String order = "";
//            System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>> ");
//            int menu = scan.nextInt();
//            if (menu == 1) {
//                don = money - (int) ((p * 3500) * 1.1);
//                order = "카페모카";
//            } else if (menu == 2) {
//                don = money - (int) ((p * 4000) * 1.1);
//                order = "카페라떼";
//            } else if (menu == 3) {
//                don = money - (int) ((p * 3000) * 1.1);
//                order = "아메리카노";
//            } else if (menu == 4) {
//                don = money - (int) ((p * 3500) * 1.1);
//                order = "과일쥬스";
//            } else {
//                for (int i = 0; true; i++) {
//                    if (menu == 1) {
//                        don = money - (int) ((p * 3500) * 1.1);
//                        order = "카페모카"; break;
//                    } else if (menu == 2) {
//                        don = money - (int) ((p * 4000) * 1.1);
//                        order = "카페라떼"; break;
//                    } else if (menu == 3) {
//                        don = money - (int) ((p * 3000) * 1.1);
//                        order = "아메리카노"; break;
//                    } else if (menu == 4) {
//                        don = money - (int) ((p * 3500) * 1.1);
//                        order = "과일쥬스"; break;
//                    }else {
//                    System.out.print("다시입력 : ");
//                    menu = scan.nextInt();
//                    }
//                }
//            }
//            System.out.println("선택한 메뉴는 : " + order + "이고 잔돈은 : " + don + "입니다.");
//            
//            
//            
//            ***** 숙제 1 ****** 
//            [!숙제!]
//            1  + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 
//            for 문을 이용한 누적합 출력하기
//
//            int sum3 =0;
//            for (int i = 0; i < 11; i++) {
//            	if (i%2==1) {
//            		sum3 = sum3 + i;
//            	} else {
//            		sum3 = sum3 + i*(-1);
//            	}
//            }System.out.println("합계는 ? " + sum3);
//
//
//
//
//            ***** 숙제 2 *****
//            [1] if ~ else문
//            농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6개이다.
//             int k1 = 127개이다. 몇 상자가 필요한가요? 
//
//            int k1 = 127;
//            int box = 0;
//            if (box%5==0) {		// box는 5의 배수가 참이라면
//            	box = k1/5;			
//            } else {				// 5의 배수가 아니라면
//            	box = (k1/5)+1;	// 농구공(k1)/5 의 몫에 +1 한 값이 상자의 갯수
//            }
//            System.out.println("필요한 상자 갯수 : " + box);
//            System.out.println("=============================");
//
//
//
//            [2] for문으로 풀기
//            0 0 0 0
//            0 0 0 0
//            0 0 0 0
//            0 0 0 0
//
//
//            for (int a = 1; a < 5; a++) {
//            	System.out.println("0 0 0 0");
//            }
//            			System.out.println("=============================");
//
//            [3] 이중 for문으로 풀기
//            1 0 0 0
//            0 1 0 0
//            0 0 1 0
//            0 0 0 1
//
//            char g ='0';
//            char h ='1';
//            for (int b = 1; b < 5; b++) { 		// 세로 줄 : 총 4줄
//            	for (int c = 1; c < 5; c++) {
//            		if (b==c) {
//            			System.out.print(h+"");
//            		} else {
//            			System.out.print(g+"");
//            		}
//            	}System.out.println();
//            					
//            }				System.out.println("=============================");
//
//
//
//            [4] 1  + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) + … 계속 더했을 때,
//            몇까지 더해야 총 합이 100이상이 되는지 구하시오.
//
//            int n;
//            int sumsum = 0;
//            for (n = 1; true ; n++) {
//            	if (n%2==1) {
//            		sumsum = sumsum + n;
//            } else {
//            		sumsum = sumsum + n*(-1);
//            	}
//            	if (sumsum >=100) break;
//            	}
//            System.out.println("n = " + n);				System.out.println("=============================");	
//
//
//
//            [5] 아래 출력하기 (for문)
//            *
//            * *
//            * * *
//            * * * *
//            for (int x = 1; x < 5; x++) { 		// 줄
//            for (int y = 1; y < x+1; y++) {		// 별
//            	System.out.print("*");
//            	}
//            	System.out.println(""); // 한 줄 출력 후 줄바꿈
//            	}
//            				System.out.println("=============================");
//
//
//            [6] 아래 출력하기 (for문)
//                  *
//                * *
//              * * *
//            * * * *
//
//            for (int s = 1; s < 5; s++) { 		// 줄 1~4줄
//            for (int t = 4; t> s ; t--) {	// 공백 s=1일때 공백 4
//            		System.out.print(" ");		// 공백 s=2일때 공백 3
//            	}
//            	for (int u = 1; u <s+1 ; u++) {	// 별
//            		System.out.print("*");		//s=1일때 별 1
//            	}
//            	System.out.println(); // 한 줄 출력 후 줄바꿈
//            }
//            							System.out.println("=============================");
//
//            
//            							
//            							// 나라를 입력하면 수도가 출력되게 하자.
//            							// 한국 -> 서울 , 중국 -> 베이징 , 일본 -> 도쿄 , 미국 -> 워싱턴
//            							// (switch~case)
//            							System.out.println("------------------------------------------");
//            							System.out.print("나라 : ");
//            							String nara = scan.next();
//            							String sudo = "";
//
//            							for (int i = 0; true; i++) {
//            								switch (nara) {
//            								case "한국":
//            									sudo = "서울"; break ;
//            								case "중국":
//            									sudo = "베이징"; break ;
//            								case "일본":
//            									sudo = "도쿄"; break ;
//            								case "미국":
//            									sudo = "워싱턴"; break ;
//            								default:
//            									System.out.println("다시입력하십시오");
//            									nara = scan.next();
//            								}
//            								System.out.println(nara + "의 수도는 " + sudo + "입니다."); break;
//            							}
    }
}
