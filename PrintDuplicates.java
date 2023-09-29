package week1.day1;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = {2, 5, 7, 7, 5, 9, 2, 3} ;

//to get the length of num 
int length = num.length;

//First loop to get the array first value
for(int i = 0; i < length; i++) 
{
	//To get the second value of the array and assign to j variable
for(int j = i + 1; j < length; j++) 
{
	
	//Compare is the i is matching with any j values
	//if matches then print that value
if(num[i]==num[j])
System.out.println("Duplicate elements in the array is: " +num[i]);
	}
}
	}}
