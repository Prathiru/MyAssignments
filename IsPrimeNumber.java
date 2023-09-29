package mypractice;

public class IsPrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 50; i++)         
	       { 		  	  
	          int counterVar=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counterVar = counterVar + 1;
		     }
		  }
		  if (counterVar ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 50 are :");
	       System.out.println(primeNumbers);
		}
	}


