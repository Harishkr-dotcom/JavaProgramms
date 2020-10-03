package Strings;

public class StringObject {
	public static void main(String[] args) {
		String s1="Harish";
		String s2=new String("Harish");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
	}

}
