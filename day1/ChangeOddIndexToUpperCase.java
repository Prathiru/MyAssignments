package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		
		char c [] = test.toCharArray();
		
		Character[] newArray = new Character[c. length];
		System.out.println(c. length);
		
		int i = 0;
		for (char value : c) {
			newArray[i++] = Character. valueOf(value);
			if (i % 2 != 1)
			{
				char upperCase = Character.toUpperCase(value);
			System.out.print(upperCase);
			}
		else
		{		
			System.out.print(value);
	}
			}
		
	}

}
