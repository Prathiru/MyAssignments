package week3.day2.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String test = "We learn java basics as part of java sessions in java week1";
int count;    

//Converts the string into lowercase    
test = test.toLowerCase();    
    
//Split the string into words using built-in function    
String words[] = test.split(" ");    
    
System.out.println("Duplicate words in a given string : ");     
for(int i = 0; i < words.length; i++) {    
    count = 1;    
    for(int j = i+1; j < words.length; j++) {    
        if(words[i].equals(words[j])) {    
            count++;    
            //Set words[j] to 0 to avoid printing visited word    
            words[j] = "0";    
        }    
    }    
        
    //print the word if count is greater than 1 
    if(count >= 1 && words[i] != "0")
        System.out.println(words[i]);    
}    
}    
}   