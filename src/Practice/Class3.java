package Practice;

import java.util.ArrayList;

public class Class3 {
	public static StringBuilder methodofString(String s){
		StringBuilder s1= new StringBuilder();
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++){
			 if(Character.isWhitespace(arr[i])){
				s1.append("%20");
			 }else{
				s1.append(arr[i]);
			 }
		}
		return s1;
	}
	
	public static void main(String[] args) {
		StringBuilder abc = methodofString("This is Harish");
		System.out.println(abc);
		}
	}


