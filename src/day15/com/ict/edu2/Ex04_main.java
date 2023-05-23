package day15.com.ict.edu2;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("선택하세요 >> 1. 고양이, 2. 강아지");
			int num = scan.nextInt();
			
			// 다른 책에서는 '정적 바인딩'이라고 부름 (1, 2나눠서 하는 것) (☆ 다형성의 정적바인딩)
			// 일반적으로 쓰는 것이 정적 바인딩인데 비해, 동적 바인딩은 용어를 알아둬야 함!!
			// 다형성 => 시험, 기술면접 등에서 나오는 것!! 
			// 숙제가 중요한 것이 아니라, 해당 숙제들을 내것으로 만드는 데 중점을 두자.
			switch (num) {
			case 1:
				Ex04_Cat cat = new Ex04_Cat();
				cat.sound();
				cat.play();
				break;
			case 2:
				Ex04_Dog dog = new Ex04_Dog();
				dog.sound();
				dog.play();
				break;
			}
			
			// 다형성의 동적바인딩
			// 정적과 다르게, 객체가 실시간으로 변하는 것을 의미함! 정해져 있지 않고, 그때 그때 실시간으로 변함.
			// 위에서는, cat dog이 정해져있지만, 밑에 코드는 animal이 cat인지 dog인지 안 정해짐!! (동적)
			// 실행할 때 animal이 상황에 따라 변하는 것!!
			Ex04_abstract animal = null;
			switch (num) {
			case 1: animal = new Ex04_Cat(); break;
			case 2: animal = new Ex04_Dog(); break;
			}
			animal.sound();
			animal.play();
			
//			System.out.println(animal.getName());
			
		}
	}
}
