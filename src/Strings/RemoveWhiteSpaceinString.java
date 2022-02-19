package Strings;

public class RemoveWhiteSpaceinString {
	public static void main(String[] args) {
		//output=Removewhitespaces
		String s="Remove   white  spaces";
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(!Character.isWhitespace(arr[i])){
				System.out.print(arr[i]);
			}
		}	
		String a = s.replaceAll(" ", "");
		System.out.println(a);
	}
}
