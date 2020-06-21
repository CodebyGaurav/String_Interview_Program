package string_package;

public class Copying_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x ="Code by Gaurav";
		char y[] = x.toCharArray();
		int size = x.length();

		char a[] = new char[size];
		
		int i=0;
		
		while(i != size)
		{
			a[i]=y[i];
			// a[size-1-i]=y[i];
			++i;
		}
		
		System.out.println(y);
		System.out.println(a);
	}

}
