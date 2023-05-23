package day13.com.ict.edu;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int row = 9;
		int column = 9;
		
		int[][] chess = new int[row][column];
		
		System.out.println("");
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess.length; j++) {
				chess[i][j] = scan.nextInt();
			}
		}
		
		Arrays.sort(chess);
		int max = chess[row][column];
		System.out.println(Arrays.asList(chess).indexOf(max));
	}	
}
