package hadooppackage;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the word you want to reverse:");
		String name = scan.next();
		System.out.println("enter the second word:");
        String name1 = scan.next();
		char[] nameArray = name.toCharArray();
		char[] newNameArray = new char[nameArray.length];
		//String[] nameArraySplit = name.split("");
		//System.out.println(nameArray[0]);
		//System.out.println(nameArraySplit[0]);
		int i=0;
	for(i=0;i<nameArray.length;i++)
	{
		newNameArray[i]=nameArray[nameArray.length-(i+1)];
		//System.out.println(newNameArray[i]);
		
	}
	//using copyValueOf command
	String newName = String.copyValueOf(newNameArray);
	System.out.println("The reverse of given word:"+ newName);
	// using compareTo command
	if(name1.compareTo(name)==0)
	{
		System.out.println("Both strings are equal/polindrome");
	}
	else
	{
		System.out.println("Both words are not palindromes");
	}
	
    scan.close();
	}
;
}
