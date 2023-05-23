package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		
	
		// 과제(1)
		System.out.println("=====과제 1번=====");
		System.out.println();
		
		// * 배열 길이 및 2차원째 배열의 인덱스 넘버 지정
		int row    = 5;		// 1차원 배열 길이
		int column = 5;		// 2차원 배열 길이
        int[][] arr = new int[row][column];
        int num = 0;	// 번호의 인덱스 넘버
        int sum = 1;	// 합계의 인덱스 넘버
        int avg = 2;	// 평균의 인덱스 넘버
        int grade = 3;	// 학점의 인덱스 넘버
        int rank = 4;	// 순위의 인덱스 넘버

        //         번호, 총점, 평균, 학점, 순위
        int[] p1 = {1, 270, 90, 'A', 1};
        int[] p2 = {2, 210, 70, 'C', 1};
        int[] p3 = {3, 180, 60, 'F', 1};
        int[] p4 = {4, 300, 100, 'A', 1};
        int[] p5 = {5, 285, 95, 'A', 1};
        
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;
           
        // 순위를 구하자. (p1 ~ p5를 arr[] 배열에 넣은 후, p1 ~ p5의 총점을 비교하여 순위 부분 숫자 더하기)
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
        		if (arr[i][sum] == arr[j][sum]) continue;
        		else if (arr[i][sum] < arr[j][sum])
    				arr[i][rank]++;
        	}
		}
        
        // 순위 오름차순
        int[][] tmp = new int[row][column];
        // 순위로 오름차순    다중 배열에선 sort 사용 불가능해서 이중 for문 사용
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
                if (arr[i][rank] > arr[j][rank]) {
                    tmp[i] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp[i];
                }
            }
        }
        
        // 출력
        // 4, 300, 100, 'A', 1
        // 5, 285, 95, 'A', 2
        // 1, 270, 90, 'A', 3
        // 2, 210, 70, 'C', 4
        // 3, 180, 60, 'F', 5
        System.out.println("번호,총점, 평균,학점,순위");
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i][num] + "  ");	
        	System.out.print(arr[i][sum] + "  ");	
        	System.out.print(arr[i][avg] + "  ");	
        	System.out.print((char)(arr[i][grade]) + "  ");	
        	System.out.print(arr[i][rank] + "  ");	
        	System.out.println();
		}
        
        
        
        
        
        System.out.println();
        System.out.println("=====과제2번=====");

        // 과제(2)

        Scanner scan = new Scanner(System.in);
        
        System.out.println("학생 수를 입력하세요 : ");
        
        // 학생수 입력받기
        int students = scan.nextInt();
        int info_counts = 4;
        int info[][] = new int[students][info_counts];
        
        // 2번째 차원 배열의 인덱스 지정
        int sum_2 = 0;
        int avg_2 = 1;
        int grade_2 = 2;
        int rank_2 = 3;
        
        int num_2 = 0;
        int kor_2 = 1;
        int eng_2 = 2;
        int math_2 = 3;
        
        // 키보드로 번호, 국어, 영어, 수학 받기
        for (int i = 0; i < students; i++) {
    		System.out.println("번호를 입력하세요 : ");
        	info[i][num_2] = scan.nextInt();
    		System.out.println("국어 성적을 입력하세요 : ");
        	info[i][kor_2] = scan.nextInt();
        	System.out.println("영어 성적을 입력하세요 : ");
        	info[i][eng_2] = scan.nextInt();
        	System.out.println("수학 성적을 입력하세요 : ");
        	info[i][math_2] = scan.nextInt();
        }
        		
        // 총점, 평균, 학점, 순위(초기값 지정)
        double scores[][] = new double[students][info_counts];
        for (int i = 0; i < scores.length; i++) {
        	scores[i][sum_2] = 0; // sum 초기화
        	scores[i][avg_2] = 0.0; // avg 초기화
        	scores[i][grade_2] = 'a'; // grade 초기화
        	scores[i][rank_2] = 1; // place 초기화        	
		}      
   
    	int kor = 1;
    	int eng = 2;
    	int math = 3;
    	
    	// 계산 (총점, 평균 구하기)
	    for (int i = 0; i < students; i++) {
	    	// 총점 구하기
	    	scores[i][sum_2] = (int)(info[i][kor_2] + info[i][eng_2] + info[i][math_2]);
	    	// 평균 구하기
	    	scores[i][avg_2] = (int)((scores[i][sum_2]/3.0)*10)/10.0;
	    }
	    
	    // 학점 구하기
	    for (int i = 0; i < students; i++) {
	    	if (scores[i][avg_2] >= 90)
	    		scores[i][grade_2] = 'A';
	    	else if (scores[i][avg_2] >= 80)
	    		scores[i][grade_2] = 'B';
	    	else if (scores[i][avg_2] >= 70)
	    		scores[i][grade_2] = 'C';
	    	else
	    		scores[i][grade_2] = 'F'; 
		}
	    
		// 순위 구하기
		for (int j = 0; j < students; j++) {
	   		for (int k = 0; k < students; k++) {
		      	if (scores[j][sum_2] == scores[k][sum_2]) continue;
		      		else if (scores[j][sum_2] < scores[k][sum_2])
		      			scores[j][rank_2]++;
	   		}
		}
	  
	    int row_2 = 4;
	    int column_2 = 4;
        double[][] tmp_2 = new double[row_2][column_2];
        // 순위로 오름차순    
        for (int i = 0; i < scores.length-1; i++) {
            for (int j = i+1; j < scores.length; j++) {
                // 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
                if (scores[i][rank_2] > scores[j][rank_2]) {
                    tmp_2[i] = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp_2[i];
                }
            }
        }
           
        // 출력
        System.out.println("번호/ 총점/ 평균/ 학점/ 순위");
    	for (int i = 0; i < students; i++) {
    		System.out.print((int)(info[i][num_2]) + "   ");	
			System.out.print((int)(scores[i][sum_2]) + "  ");	
        	System.out.print(scores[i][avg_2] + "  ");	
        	System.out.print((char)(scores[i][grade_2]) + "  ");	
        	System.out.print((int)(scores[i][rank_2]) + "  ");	
        	System.out.println();
    		}

	}
}
