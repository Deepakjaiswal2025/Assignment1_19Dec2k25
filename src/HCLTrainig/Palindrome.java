package HCLTrainig;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("TAke Inpute from User");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		isPalindrome(num);

	}
	public static void isPalindrome(int n) {
		int temp =n;
		int sum = 0;
		while(temp>0) {
			int last = temp%10;
			sum = sum*10+last;
			temp/=10;
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Is palindrom");
		}else {
			System.out.println("Is not palindrom");
		}
		
	}

}
