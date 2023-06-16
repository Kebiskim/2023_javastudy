package jdbc.com.ict.edu4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요.");
		System.out.println("1. 테이블 전체 데이터 보기");
		System.out.println("2. 테이블 특정 데이터 보기");
		System.out.println("3. 데이터 삽입");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 테이터 수정");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		int menu = scan.nextInt();
		switch (menu) {
		case 1: 
			ArrayList<VO> list = DAO.getInstance().getSelectAll();
			for (VO k : list) {
				System.out.print(k.get고객아이디()+"\t");
				System.out.print(k.get고객이름()+"\t");
				System.out.print(k.get나이()+"\t");
				System.out.print(k.get등급()+"\t");
				System.out.print(k.get직업()+"\t");
				System.out.print(k.get적립금()+"\n");
			}
			break;
		case 2:
			VO_2 = DAO.getInstance().getSelectOne();
		}
	}
}
