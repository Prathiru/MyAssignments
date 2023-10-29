package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> a1 = new ArrayList<Integer>();
		//{3,2,11,4,6,7}
		a1.add(3);
		a1.add(2);
		a1.add(11);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		List <Integer> a2 = new ArrayList<Integer>();
//{1,2,8,4,9,7};
		a2.add(1);
		a2.add(2);
		a2.add(8);
		a2.add(4);
		a2.add(9);
		a2.add(7);
		int lengtha1 = a1.size();
		int lengtha2 = a2.size();
		List <Integer> a3 = new ArrayList<Integer>();

		for(int i=0; i<=lengtha1-1 ;i++)
		{ 
			int value1= a1.get(i);
			
			for(int j=0; j<=lengtha2-1 ; j++)
			{
				int value2= a2.get(j);

				if(value1==value2)
				{
				System.out.println(value2);
				a3.add(value2);
				}
			}
			 System.out.println("The intersected value is" + a3);
		}
	}
}

