package string_package;

import java.util.Scanner;

public class Panagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String x =sc.nextLine().toUpperCase();		
		x = x.replace(" ","");

		char y[] = x.toCharArray();
		int size = y.length;
		
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i=0;
		while(i != size)		// store index 1
		{
			int index = y[i]-65;
			a[index]=1;
			i++;
		}
		
		i=0;
		while(i != 26)			// check index 1 
		{
			if(a[i] == 1)
			{
				++i;
			}
			else
			{
				System.out.println("Non Pangran");
				System.exit(0);
			}
		}
		System.out.println("Pangran");

	}

}
