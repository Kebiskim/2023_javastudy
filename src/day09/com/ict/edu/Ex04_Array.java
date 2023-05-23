package day09.com.ict.edu;

public class Ex04_Array {
	public static void main(String[] args) {
		// 순위구하기
		// 1. 모든 사람의 순위를 1등으로 초기값 지정한다.
		// 2. 모든 사람과 비교해야 된다.(자기자신은 제외)
		// 3. 나(i) 보다 남(j)의 비교대상이 크면 내 순위를 증가시킨다.
		
		// sum 배열 만들고, rank 배열 만들어서 모든 칸에 1로 초기화 선언.
		// i는 모든 j와 비교한 후, 순위 매김. 그 이후, 두번째 i는 또다시 모든 j와 비교한 후, 순위 매김.
		// 모든 사람이 서로에 대해서 전부 비교해야 함. (★★★정렬이랑 다른 부분 체크!!)
		
		// i	j	j	j	j
		// j	i	j	j	j 
		int su[]   = {90,80,70,95,90,85,75};
		int rank[] = {1, 1, 1, 1, 1, 1, 1};
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				// 자기자신은 제외하고 나머지랑 다 비교
				if (su[i] == su[j]) continue;	// 이부분 제외해 버려도, 어차피 이 경우는 안 나옴. 상관 X
				else if (su[i] < su[j]) {	// 남이 더 큰 경우에는, 나의 순위를 올림. (내가 더 밑이라는 뜻)
					rank[i]++;
				}
			}
		}
		for (int i = 0; i <su.length; i++) {
			System.out.print(rank[i] + " ");
		}
		
		
	}
}