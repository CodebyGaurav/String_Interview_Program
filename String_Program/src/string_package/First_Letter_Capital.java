package string_package;

public class First_Letter_Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "code by gaurav";
		char y[] = x.toCharArray();
		int size = y.length;
		System.out.println(x);
		System.out.println(size);
		
		y[0]=(char)(y[0]-32);
		int i=1;
		while(i!=size)
		{
			if(y[i]==' ')
			{
				y[i+1]=(char)(y[i+1]-32);
			}
			++i;
		}
		
		System.out.println(y);
	}

}
