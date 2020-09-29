package Practice;

public class Class4 {
	public static void main(String[] args) {
		String s= "Harish";
		String s1= "Harish";
		String s2 = new String("Harish");
		String s3 = new String("Harish");
		if(s==s1){
			System.out.println("True literal");
		}else{
			System.out.println("False");
		}
		if(s.equals(s1)){
			System.out.println("True literal equals method");
		}else{
			System.out.println("False");
		}
		if(s2==s3){
			System.out.println("True non literal == operator");
		}else{
			System.out.println("False");
		}
		if(s2.equals(s3)){
			System.out.println("True non literal equals method");
		}else{
			System.out.println("False");
		}
		s=s.replace("H", "");
		System.out.println(s+"H");
	}

}
