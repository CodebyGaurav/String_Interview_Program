package string_package;

public class Computing_length_String {

	public static void main(String[] args) {
	
		System.out.println("Length :");
		
		String str = "Code by Gaurav"; //
		str = str.concat("\0");
		char y[] = str.toCharArray();
		
		int count = 0;
		int i=0;
		while(y[i] !='\0')
		{
			++count;
			i++;
		}
		System.out.println(count);

	}

}
