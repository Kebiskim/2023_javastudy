package day13.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		
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
		
		for (int i = 0; i < p5.length; i++) {
			for (int j = 0; j < p5.length; j++) {
				if (arr[i][1] == arr[j][1]) continue;
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		int[] tmp = new int[5];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j==3) {
					System.out.print((char)(arr[i][j]) + "\t");
				}else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
	}
}
