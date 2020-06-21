package string_package;

import java.util.Scanner;

public class Remove_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.nextLine();
		
		for (char c : str.toCharArray()) {
			if( c != ' ')
				System.out.print(c);
		}

		
	}

}
