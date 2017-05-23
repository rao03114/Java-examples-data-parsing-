package hadooppackage;

import java.util.ArrayList;

public class MovingDuplicateValuesToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> letters = new ArrayList<String>();
		

		letters.add("za");
		letters.add("ab");
		letters.add("za");
		letters.add("za");
		letters.add("ba");
		
		findDuplicates(letters);
		

	}
	public static void findDuplicates(ArrayList<String> input)
	{
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> duplicateLetters = new ArrayList<String>();
		ArrayList<String> letters2 = (ArrayList<String>) input.clone();
		for(String item : input)
		{
			if(!temp.contains(item))
			{
				temp.add(item);
			}
			else
			{
				duplicateLetters.add(item);
			} 
			
		}
		System.out.println("letters2:"+letters2);
		System.out.println("letters:"+input);
		System.out.println("temp:"+temp);
		System.out.println("duplicate:"+duplicateLetters);
	}
	

}
