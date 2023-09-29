package mypractice;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number to check palindrome: ");
	      
	      
	      int num = sc.nextInt();
	     
	      int copy = num;
	   
	      int rev = 0;
	      
	      while(copy != 0) {
	         int rem = copy % 10; 
	         copy /= 10;  
	         rev = rev * 10 + rem; 
	      }
	   
	      if(num == rev) {
	         System.out.println(num + " is a Palindrome number");
	      } else {
	         System.out.println(num + " is not a Palindrome number");
	      }

	}
}
