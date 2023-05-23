//package day12.com.ict.edu;
//
//import java.util.Scanner;
//
//public class Ex03_main {
//	public static void main(String[] args) {
//		
//		Ex03_get_set coffee = new Ex03_get_set();
//		coffee.setName("커피음료");
//		coffee.setPrice(1000);
//		
//		// public 인 경우 => ion.name = "이온음료"; 와 같이 접근
//		// private 이고 getter, setter를 사용하는 경우, 위와 같이 접근!!
//
//		Ex03_get_set ion = new Ex03_get_set();
//		ion.setName("이온음료");
//		ion.setPrice(1500);
//		
//		Ex03_get_set coke = new Ex03_get_set();
//		coke.setName("탄산음료");
//		coke.setPrice(1200);
//		
//		Ex03_get_set juice = new Ex03_get_set();
//		juice.setName("과일음료");
//		juice.setPrice(1800);
//		
//		Ex03_get_set returns = new Ex03_get_set();
//		returns.setName("반환");
//		returns.setPrice(0);
//		
////		Ex03_get_set[] arr = new Ex03_get_set[4];
////		arr[0] = coffee;
////		arr[1] = ion;
////		arr[2] = coke;
////		arr[3] = juice;
//		
//		// 미리 만들어져 있을 때는 위처럼 말고, 아래와 같이 선언과 동시에 입력값 넣어주면 한줄로 정리 가능!!
//		Ex03_get_set[] arr = {coffee, ion, coke, juice, returns};
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("금액을 투입하세요 >>> ");
//		int input = scan.nextInt();
//		
//		// 음료들의 최소금액을 구하자. (오름차순에서 맨 처음이 최소값, 맨 끝이 최대값)
//		
//		int output = 0;
//		loop:
//		do {
//			if(input < 1000) {
//				System.out.println("금액이 부족합니다.");
//				System.out.println("잔돈 : " + input);
//				break;
//			}else {
//				System.out.println("커피\t이온\t탄산\t과일\t반환");
//			}
//				
//			// 입력금액과 각 음료수의 가격을 비교
//			for (int i = 0; i < arr.length; i++) {
//				if(arr[i].price <= input) {
//					System.out.print("O\t");
////						System.out.print(arr[i].name+"\t");
//				}else {
//					System.out.print("X\t");
//				}
//			}
//			System.out.println();
//			System.out.print("선택하세요 >> ");
//			String drink = scan.next();
//			switch (drink) {
//			case "반환" : System.out.println("자판기를 종료합니다.");
//					break loop;
//			case "커피" : output = input - arr[0].getPrice(); break;
//			case "이온" : 
//				if (input >= ion.price) { 
//					output = input - arr[1].price; break;
//				}else 
//					System.out.println("잘못 선택하셨습니다 (잔액 부족)");
//					output = input; break;
//			case "탄산" : 
//				if (input >= coke.price) { 
//					output = input - arr[2].price; break;
//				}else 
//					System.out.println("잘못 선택하셨습니다 (잔액 부족)");
//					output = input; break;
//			case "과일" : 
//			if (input >= juice.price) { 
//					output = input - arr[3].price; break;
//			}else 
//				System.out.println("잘못 선택하셨습니다 (잔액 부족)");
//				output = input; break;
//			default :
//				System.out.println("잘못 선택하셨습니다."); 
//				output = input;
//			}
//			System.out.println("잔돈 : " + output);
//			input = output;
//			continue;
//		} while (output >= coffee.price);
//		
//		if (input < 1000)
//			System.out.println("자판기를 종료합니다.");
//		
//		// 반환버튼 (안 사고 반환하는 것) 만들고, case 부분에서 가격이 input보다 작으면 -로 안뜨게
//	}
//}
