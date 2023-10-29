package week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		
		String companyName = "Google";
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
	
		for (char character : companyName.toCharArray())
		{
			uniqueChar.add(character);
		}
		for (Character character : uniqueChar)
		{
			System.out.print(character);
		}
	}
}
