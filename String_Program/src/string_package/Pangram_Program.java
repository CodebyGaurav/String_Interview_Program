package string_package;

public class Pangram_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		x=x.replace(" ", "");
		char y[] = x.toCharArray();
		int size = y.length;
		
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i=0;
		while(i != size)
		{
			int index = y[i]-65;
			a[index] = 1;
			++i;
		}
		i=0;
		while(i != 26)
		{
			if(a[i]==1)
			{
				++i;
			}
			else
			{
				System.out.println("Not Pangran");
			}
		}
		
		System.out.println("Pangaram");
	}

}
