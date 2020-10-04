package Arrays;

import java.util.Arrays;

public class SortCharectors {
	//sortusinginbuiltmethod
	//output= Hahirs
	public static void main(String[] args) {
		String s1 = "Harish";
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}
}
