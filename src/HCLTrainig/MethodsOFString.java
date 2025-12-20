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

	        Scanner sc = new Scanner(System.in);
	        int choice;

	        System.out.println("Enter a String:");
	        String str = sc.nextLine();

	        do {
	            System.out.println("\n--- STRING OPERATIONS MENU ---");
	            System.out.println("1. length()");
	            System.out.println("2. isEmpty()");
	            System.out.println("3. charAt()");
	            System.out.println("4. toString()");
	            System.out.println("5. equals()");
	            System.out.println("6. compareTo()");
	            System.out.println("7. contains()");
	            System.out.println("8. indexOf()");
	            System.out.println("9. lastIndexOf()");
	            System.out.println("10. startsWith()");
	            System.out.println("11. endsWith()");
	            System.out.println("12. matches()");
	            System.out.println("13. substring()");
	            System.out.println("14. toLowerCase()");
	            System.out.println("15. trim()");
	            System.out.println("16. replace()");
	            System.out.println("17. split()");
	            System.out.println("18. join()");
	            System.out.println("19. valueOf()");
	            System.out.println("20. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {

	                case 1:
	                    System.out.println("Length: " + str.length());
	                    break;

	                case 2:
	                    System.out.println("Is Empty: " + str.isEmpty());
	                    break;

	                case 3:
	                    System.out.print("Enter index: ");
	                    int index = sc.nextInt();
	                    System.out.println("Character: " + str.charAt(index));
	                    break;

	                case 4:
	                    System.out.println("toString(): " + str.toString());
	                    break;

	                case 5:
	                    System.out.print("Enter another string: ");
	                    String s1 = sc.nextLine();
	                    System.out.println("Equals: " + str.equals(s1));
	                    break;

	                case 6:
	                    System.out.print("Enter another string: ");
	                    String s2 = sc.nextLine();
	                    System.out.println("CompareTo: " + str.compareTo(s2));
	                    break;

	                case 7:
	                    System.out.print("Enter substring: ");
	                    String sub = sc.nextLine();
	                    System.out.println("Contains: " + str.contains(sub));
	                    break;

	                case 8:
	                    System.out.print("Enter character/string: ");
	                    String ch = sc.nextLine();
	                    System.out.println("IndexOf: " + str.indexOf(ch));
	                    break;

	                case 9:
	                    System.out.print("Enter character/string: ");
	                    String ch2 = sc.nextLine();
	                    System.out.println("LastIndexOf: " + str.lastIndexOf(ch2));
	                    break;

	                case 10:
	                    System.out.print("Enter prefix: ");
	                    String pre = sc.nextLine();
	                    System.out.println("StartsWith: " + str.startsWith(pre));
	                    break;

	                case 11:
	                    System.out.print("Enter suffix: ");
	                    String suf = sc.nextLine();
	                    System.out.println("EndsWith: " + str.endsWith(suf));
	                    break;

	                case 12:
	                    System.out.print("Enter regex: ");
	                    String regex = sc.nextLine();
	                    System.out.println("Matches: " + str.matches(regex));
	                    break;

	                case 13:
	                    System.out.print("Enter start index: ");
	                    int start = sc.nextInt();
	                    System.out.print("Enter end index: ");
	                    int end = sc.nextInt();
	                    System.out.println("Substring: " + str.substring(start, end));
	                    break;

	                case 14:
	                    System.out.println("Lowercase: " + str.toLowerCase());
	                    break;

	                case 15:
	                    System.out.println("Trimmed String: " + str.trim());
	                    break;

	                case 16:
	                    System.out.print("Enter old character/string: ");
	                    String oldStr = sc.nextLine();
	                    System.out.print("Enter new character/string: ");
	                    String newStr = sc.nextLine();
	                    System.out.println("Replaced: " + str.replace(oldStr, newStr));
	                    break;

	                case 17:
	                    String[] parts = str.split(" ");
	                    System.out.println("Split Result:");
	                    for (String p : parts) {
	                        System.out.println(p);
	                    }
	                    break;

	                case 18:
	                    String joined = String.join("-", str.split(" "));
	                    System.out.println("Joined String: " + joined);
	                    break;

	                case 19:
	                    int num = 100;
	                    String value = String.valueOf(num);
	                    System.out.println("valueOf(): " + value);
	                    break;

	                case 20:
	                    System.out.println("Program Exited.");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 20);
	    }
	}

/* 
 * public static void main(String[] args) {
	  
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
     
     // equlasignoreCase()
     System.out.println("take one another String for perform camparision..");
     String str2 = sc.nextLine();
     System.out.println(str.equalsIgnoreCase(str2));
     
     // startWith()
     String str3 = sc.nextLine();
     System.out.println(str3.startsWith("@gmail.com"));
     System.out.println(str3.startsWith("@yahoo.com"));
     //
     
     String email = sc.nextLine();
     System.out.println(email.endsWith("@gmail.com"));
     System.out.println(email.endsWith("@yahoo.com"));
     
     
  } */
