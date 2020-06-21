package string_package;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Sujeet Sharma"; 
		x=x.replace(" ", "");       //toohottohoot
		//x=x.toLowerCase();							//too Hot to HOOT
		x=x.toUpperCase();
		char y[] = x.toCharArray();
		int size = x.length();
		
		char a[] = new char[size];
		
		int i=0;
		while(i != size)
		{
			a[size-1-i]=y[i];
			++i;
		}
			
		i=0;
		while(i != size)
		{
			if(a[i]!=y[i])
			{
				System.out.println("Not a Palindrome");
				System.exit(0);	
			}
			else
			{
				++i;
				continue;
			}
			
		}
		System.out.println("Palindrome");
		

	}

}
