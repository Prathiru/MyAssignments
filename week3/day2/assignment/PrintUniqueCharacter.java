package week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Prathibha";
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
	
		for (char character : name.toCharArray())
		{
			uniqueChar.add(character);
		}
		for (Character character : uniqueChar)
		{
			System.out.print(character);
	}
	}
}