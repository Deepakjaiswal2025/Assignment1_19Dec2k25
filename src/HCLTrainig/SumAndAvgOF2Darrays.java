package HCLTrainig;

import java.util.Scanner;

public class SumAndAvgOF2Darrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Take Input from the user...");
		
		System.out.println("enter the row..");
		int r = sc.nextInt();
		
		System.out.println("enter the column..");
		int c = sc.nextInt();
		
		// declaration of 2D array...
		int[][] arr = new int[r][c];
		
		
		// take element of 2D Array...
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// call the method.... 
		sumAndAvg(arr, r, c);

		System.out.println(" program is succefully completed.....!");
		
		System.out.println("End of program....!");
		
	}
	public static void sumAndAvg(int[][] arr, int r, int c) {
		int sum = 0;
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("sum of 2d array :"+ sum);
		int totalEle = r*c;
		double avg = sum/totalEle;
		System.out.println("Average of 2D array......"+ avg);
		
	}

}
