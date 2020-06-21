package string_package;

public class Vowel_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Code by Gaurav Sharma";
		
		char y[] = x.toCharArray();
		int size = y.length;
		int vowels = 0;
		int consents = 0;
		int spellschar = 0;
		
		int i=0;
		while(i != size)
		{
			if((y[i]>='A'&& y[i]<='Z')||(y[i]>='a'&& y[i]<='z'))	
			{
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U'||y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u')
				{
					++vowels;
				}
				else
				{
					++consents;
				}
			}
			else
			{
				++spellschar;
			}
			++i;
		}
		System.out.println(y);
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonant : "+consents);
		System.out.println("Special Character : "+spellschar);
		
	}

}
