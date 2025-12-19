package HCLTrainig;

import java.util.Scanner;

public class FindMAx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take i/p....");
		int n= sc.nextInt();
		int[] arr = new int[n];
		
		int max =0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println("End of program....");
	}

}
