package Strings;

public class SeparateCharacters {
	public static void main(String[] args) {
		String s="Harish124dhg21$^$^GGB12hgg55f#$^^";
		char[] arr = s.toCharArray();
		String alpha="";
		String numbers="";
		String others="";
		for(int i=0;i<arr.length;i++){
			if(Character.isAlphabetic(arr[i])){
				alpha=alpha+arr[i];
			}
			else if(Character.isDigit(arr[i])){
				numbers=numbers+arr[i];
			}else{
				others=others+arr[i];
			}
		}
		System.out.println(alpha);
		System.out.println(numbers);
		System.out.println(others);
	}
}
