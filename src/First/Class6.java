package First;

public class Class6 
{
	public static void main(String[] args) 
	{
		String s1="abjdshkou";
		int vowels = 0;
		for(int i = 0; i < s1.length(); ++i)
        {
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
		
        }
		System.out.println(vowels);
	}

} 
