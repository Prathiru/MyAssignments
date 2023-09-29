package mypractice;

public class FindIntersection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int[] array1 = {3,2,11,4,6,7};
	int[] array2 = {1,2,8,4,9,7};
	int lengtha1 = array1.length;
	int lengtha2 = array2.length;
		
	for(int i=0; i<lengtha1 ;i++)
	{ 
		for(int j=0; j<lengtha2 ; j++)
		{
			if(array1[i]==array2[j])
			{
				System.out.println("The match from first array is" + array1[i]);
			}
		}
	}
	}
}
