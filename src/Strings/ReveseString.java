package Strings;

public class ReveseString {
	public static void main(String[] args) {
		String s = "Harish";
		String rev="";
		for(int i=s.length()-1; i>=0;i--){
			System.out.print(s.charAt(i));
		}
		
	}
}
