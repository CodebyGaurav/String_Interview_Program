package string_package;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "GAURAV";
		String y = "AARUVG";
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		
		if(result == true)
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
	}

}
