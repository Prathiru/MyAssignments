package week.day1;

public class LearnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Testleaf Learning week3 classes";
		int c =0;
		//i convert as character array
		char [] charA = name.toCharArray();
		int len = charA.length;
		
		for (int i=0; i<len; i++)
		
		{
			if (charA[i]=='e')
			{
				c++;
			}			
		}
		System.out.println(c);

	}

}
