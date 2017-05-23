package hadooppackage;

import java.util.Scanner;

public class Polindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word to check palindrome:");
		String word = scan.next();
		char[] parts = word.toCharArray();
		//System.out.println(parts[0]);
		boolean isPalindrome = true;
		for(int i=0;i<parts.length;i++)
			{
			if(parts[i]!=parts[parts.length-(1+i)])
			{
				
				isPalindrome = false;
				break;
			}
			}
		if(isPalindrome)
		{
			System.out.println(word + " " + "is  a palindrome" );
		}
		else
			System.out.println(word + " " + "is not a palindrome");
	}
   
		
	
}
