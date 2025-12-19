package HCLTrainig;

import java.util.Scanner;

//import java.util.Scanner;

public class Armstrong {  // An Armstrong number is a number in which the sum of each digit raised 
	//to the power of the total number of digits is equal to the original number.
	public static void main(String[] args) {
	    Scanner  sc = new Scanner(System.in);
	    System.out.println("Take Input from the user......");
		int n = sc.nextInt();
		isArms(n);
		System.out.println("End of program....");
		

	}
	
	public static void isArms(int n) {
		int temp = n;
		int digits=0;
		int sum =0;
		
		// count total number of digits
		while(temp>0) {
			digits++;
			temp/=10;
		}
	   temp = n;
	   
	   // for calculate arms
	   while(temp>0) {
		   int last = temp%10;
		   sum+=Math.pow(last, digits);
		   temp/=10;
	   }
	   
	   if(n==sum) {
		   System.out.println("Is ArsmStrong number");
	   }else {
		   System.out.println("Is not ArsmStrong number");
	   }
	   
		
		
	}
	/*
	 * public static int factorail(int n) { int fon=1; for(int i=1;i<=n;i++) { fon=
	 * fon*i; } return fon; }
	 */

}
