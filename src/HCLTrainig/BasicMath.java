package HCLTrainig;

import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take Input from the user..!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//  method calls
	    System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
        System.out.println("Remainder: " + remainder(x, y));
        square(x, y);
        cube(x, y);		
	    System.out.println("Absolute of -10: " + absolute(-10));
		

	}
	
	// addition
	
	 public static int add(int a, int b) {
		 int sum = a+b;
		 return sum;
	 }
	 
	 // subtraction
	 
	 public static int subtract(int a, int b) {
		 int subt = a-b;
		 return subt;
	 }
	 
	 //  multification
	 
	 public static int multiply(int a, int b) {
		 int mul = a*b;
		 return mul;
	 }
	 
	 // Division
	 
	 public static int divide(int a, int b) {
		 int div = a/b;
		 return div;
	 }
	 
	 // Remainder
	 
	 public static int remainder(int a, int b) {
		 int rmd = a%b;
		 return rmd;
	 }
	 
	// Square
	 public static void square(int a, int b) {
		    System.out.println("square of both number :"+ a*a+", "+ b*b);
	 }
	 
	 // cube
	 public static void cube(int a, int b) {
		    System.out.println("Cube of both number :"+ a*a*a+", "+ b*b*b);
	 }
	 
	 //absolute
	public static int absolute(int a) {
	        if (a < 0)
	            return -a;
	        else
	            return a;
	    }


}

/* 
 * take example 
 * Take Input from the user..!
10 6
Addition: 16
Subtraction: 4
Multiplication: 60
Division: 1
Remainder: 4
square of both number :100, 36
Cube of both number :1000, 216
Absolute of -10: 10
 */
