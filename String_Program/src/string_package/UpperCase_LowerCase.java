package string_package;

public class UpperCase_LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = "code by gaurav";
		char y[] = x.toCharArray();
		int size = y.length;
		
		int i=0;
		while(i != size)
		{
			if(y[i]!= ' ')
			{
				y[i] = (char)(y[i]-32); //Typecasting 	
			}
			++i;
			
		}
		System.out.println(x);
		System.out.println(y);
	}

}
