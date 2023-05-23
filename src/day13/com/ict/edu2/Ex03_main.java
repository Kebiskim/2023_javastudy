package day13.com.ict.edu2;

import day13.com.ict.edu.Ex03_static;

public class Ex03_main {
	public static void main(String[] args) {
		// static 접근제한
		// k1 = public = 누구나 다 접근
		// k2 = 생략 = default
		// k3 = private = 외부에서 접근 못함
		// static보다 접근제한자가 우선순위가 훨씬(가장) 높기 때문에
		// private에 접근할 수 없음.
		// protected는 쓸일 거의 없는데, 상속 배우고 나서 쓸 수 있음.
		
		// 팀과제 : 코딩은 젤 못하는 사람이 많이 하고, 잘하는 사람이 서포트
		// 잘하는 사람이 취합하는 것!!
		// package : 기능별로 묶어서 처리하는 것!!
		// 깃 : 누가 몇시에 어떤 메일주소로 작업했는지 나옴.
		// DB에서 롤백 하듯이, 깃에서도 되살리기 가능은 함.
		// 데이터필드는 private, class는 public으로 주로 사용??
		// getter 혹은 setter를 통해서 들어가는 것 => 캡슐화 or 은닉화
		System.out.println(Ex03_static.k1);
//		System.out.println(Ex03_static.k2);
//		System.out.println(Ex03_static.k3);
	}
}
