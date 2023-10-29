package week3.day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "We learn java basics as part of java sessions in java week1"; 
		    
		//Split the string into words using built-in function    
		String words[] = test.split(" ");   
		
		for(int i = 0; i < words.length; i++) 
		{  
		if(i%2!=0)
			{
			char[] ch = words[i].toCharArray();
			String rev="";
			
			for(int j = ch.length-1 ; j >=0 ; j--) 
			{  
				rev=rev+ch[j];
			}
			System.out.println(rev);
			}
		else
		{
			System.out.println(words[i]);
		}
		}
	}

}
