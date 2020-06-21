package string_package;

public class Verify_String_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "98765";
	//	char y[] = x.toCharArray();
	//	int size = y.length;
		int size = x.length();
		
		int i=0;
		while(i!=size)
		{
		//	if(y[i]>='0'&& y[i]<='9')
			if(x.charAt(i)>='0'&& x.charAt(i)<='9')
			{
				++i;
			}
			else
			{
				System.out.println("Not an Integer String");
				
			}
//			System.out.println("integer no : "+y[i-1]);
			System.out.println("integer no : "+x.charAt(i-1));
		}
		System.out.println("Integer String");
	}

}
