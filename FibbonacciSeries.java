package mypractice;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,sum,i,count=8;  
		 System.out.println(num1);//printing 0 and 1  
		 System.out.println(num2);
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
		 {  
		  sum=num1+num2;  //First time n3=0+1 = 1, 2ndtime n3=1+1=2, 3rd time n3=1+2=3,
		  //4th time n3=2+3=5, 
		  System.out.println(" "+sum);  //print 1, print 2,print 3,print 5
		  num1=num2;  //n1=1, n1=1, n1=2,n1=3,
		  num2=sum;  //n2=1, n2=2, n2=3, n2=5
		 }  

	}
}
