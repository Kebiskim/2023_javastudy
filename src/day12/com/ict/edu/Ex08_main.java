package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		
		Ex08_Constructor coffee = new Ex08_Constructor("커피음료", 1000);
		// Ex03_get_set에서 세줄 쓴 것을 한 줄로 끝내버린 것.
		Ex08_Constructor ion = new Ex08_Constructor("이온음료", 1500);
		Ex08_Constructor coke = new Ex08_Constructor("탄산음료", 1200);
		Ex08_Constructor juice = new Ex08_Constructor("과일음료", 1800);
		Ex08_Constructor returns = new Ex08_Constructor("반환", 0);
		
		Ex08_Constructor[] arr = {coffee, ion, coke, juice, returns};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		int input = scan.nextInt();
		
		// 음료들의 최소금액을 구하자. (오름차순에서 맨 처음이 최소값, 맨 끝이 최대값)
		
		int output = 0;
		loop:
		do {
			if(input < 1000) {
				System.out.println("금액이 부족합니다.");
				System.out.println("잔돈 : " + input);
				break;
			}else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
			}
				
			// 입력금액과 각 음료수의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input) {
					System.out.print("O\t");
//						System.out.print(arr[i].name+"\t");
				}else {
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.print("선택하세요 >> ");
			String drink = scan.next();
			switch (drink) {
			case "반환" : System.out.println("자판기를 종료합니다.");
					break loop;
			case "커피" : output = input - arr[0].getPrice(); break;
			case "이온" : 
				if (input >= ion.price) { 
					output = input - arr[1].price; break;
				}else 
					System.out.println("잘못 선택하셨습니다 (잔액 부족)");
					output = input; break;
			case "탄산" : 
				if (input >= coke.price) { 
					output = input - arr[2].price; break;
				}else 
					System.out.println("잘못 선택하셨습니다 (잔액 부족)");
					output = input; break;
			case "과일" : 
			if (input >= juice.price) { 
					output = input - arr[3].price; break;
			}else 
				System.out.println("잘못 선택하셨습니다 (잔액 부족)");
				output = input; break;
			default :
				System.out.println("잘못 선택하셨습니다."); 
				output = input;
			}
			System.out.println("잔돈 : " + output);
			input = output;
			continue;
		} while (output >= coffee.price);
		
		if (input < 1000)
			System.out.println("자판기를 종료합니다.");
	}
}
