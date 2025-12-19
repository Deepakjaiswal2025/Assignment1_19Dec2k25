package HCLTrainig;

import java.util.Scanner;

/* length();
 * toLowerCase();
 * toUpperCase();
 * charAt();
 * equals()
 * equlasignoreCase()
 * startWith()

 * endsWith();
 * 
 * */

public class MethodsOFString {
  public static void main(String[] args) {
	  
	 Scanner sc  = new Scanner(System.in);
	 System.out.println("Take input from user...");
	 
	 String str = sc.nextLine();
	 
	 // length();
	 
	 System.out.println("length of String : "+ str.length());
	 // toLowerCase(); 
	 System.out.println("toLowerCase of String : "+ str.toLowerCase());
	 // toUpperCase(); 
	 System.out.println("toLowerCase of String : "+ str.toUpperCase());
	 //charAt();
	 System.out.println("Character of String....");
     for(int i =0;i<str.length();i++) {
    	  char ch = str.charAt(i);
    	  System.out.println(ch+" ");
     }
     
     // equals()
     System.out.println("take one another String for perform camparision..");
     String str1 = sc.nextLine();
     System.out.println(str.equals(str1));
     
     // == address
     System.out.println(str == str1);
     
  }
	
}
