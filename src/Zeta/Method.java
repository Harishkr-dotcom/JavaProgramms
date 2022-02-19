package Zeta;

import java.util.ArrayList;

public class Method {
	
	public int m1(int a,int b){
		System.out.println(a+b);
		return a+b;//this gets executed
	}
	
	public double m2(int a,int b){
		System.out.println(a*b);
		return a*b;
	}
	
	public static void main(String[] args) {
		Method m= new Method();
		m.m1(3, 2);
		
		ArrayList<String> arr= new ArrayList<>();
		arr.add("a");
		arr.add("a");
		arr.add("c");
		arr.add("a");
		System.out.println(arr.indexOf("a"));//0
	}

}
