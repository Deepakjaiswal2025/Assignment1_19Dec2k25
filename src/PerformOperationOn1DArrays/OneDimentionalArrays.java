package PerformOperationOn1DArrays;

import java.util.*;
public class OneDimentionalArrays {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the length of array:");
	        int size = sc.nextInt();
	        
	     // declare array with length
	        int[] arr = new int[size];
	        int n = 0, choice;

	        do {
	            System.out.println("\n1.Insert 2.Delete 3.Linear Search 4.Binary Search");
	            System.out.println("5.Max 6.Even/Odd Count 7.Insertion Sort 9.Exit");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    if (n < size) {
	                        System.out.print("Enter element: ");
	                        arr[n++] = sc.nextInt();
	                    } else {
	                        System.out.println("Array is full");
	                    }
	                    break;

	                case 2:
	                	System.out.println("Enter the index which you want to delete : ");
	                    int idx = sc.nextInt();
	                    if (idx >= 0 && idx < n) {
	                        for (int i = idx; i < n - 1; i++) {
	                            arr[i] = arr[i + 1];
	                        }
	                        n--;
	                    } else {
	                        System.out.println("Invalid index");
	                    }
	                    break;
	                case 3: System.out.println("Enter element to search: ");
	                        int key = sc.nextInt(); 
	                        for(int i =0;i<n;i++){ 
	                         if(arr[i]== key) { 
	                        	System.out.println("Found at " + i); 
	                        	break; 
	                        	}
	                        } break;    
	                case 4: System.out.println("Enter element to search: ");
			                Arrays.sort(arr,0 , n); 
			                int ele = sc.nextInt(); 
			                int pos = Arrays.binarySearch(arr, 0, n, ele); 
			                System.out.println("Position :"+ pos); 
			                break; 
			                
	                case 5: System.out.println("find the largest value : ");
			                int max = arr[0]; 
			                for(int i=1; i<n;i++) {
			                	if(arr[i]>max) { 
			                		max = arr[i]; 
			                		} 
			                	} 
			                break; 
	                case 6: System.out.println("find the largest value : "); 
			                int evencount =0, oddcount =0;
			                for(int i=0; i<n;i++) {
			                	if(arr[i]%2==0) {
			                		evencount++; 
			                		}else oddcount++; 
			                	}
			                System.out.println("Even: " + evencount + " Odd: " + oddcount);
			                break;        
			                
	                case 7: System.out.println("perform insertion sort on arrays: ");
	                        for (int i = 1; i < n; i++) {
		                        int temp = arr[i];
		                        int j = i - 1;
		                        while (j >= 0 && arr[j] > temp) {
		                            arr[j + 1] = arr[j];
		                            j--;
		                        }
		                        arr[j + 1] = temp;
	                         }
			                    System.out.println("Array sorted using Insertion Sort");
			                    break;
	            }
	        } while (choice != 8);
	    }
}
