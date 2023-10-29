package week3.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 5, 4, 7 };
        int N = arr.length;
        System.out.println(getMissingNo(arr, N));
		
	}
	public static int getMissingNo(int[] nums, int n)
    {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }
}
		
