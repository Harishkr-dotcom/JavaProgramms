package Practice;

import java.util.Arrays;
import java.util.Collections;

public class CharSort {
	public static void main(String[] args) {
		String s="Hi this is harish";
		String[] a = s.split(" ");
		String iii = a.toString();
		System.out.println(a.length);
		String s1 ="Hi-this";
		System.out.println(s1.length());
		String[] b = s1.split("-");
		for(int i=0; i<b.length;i++ ){
			System.out.println("["+b[i]+"]");
		}
		
	}
	

}
