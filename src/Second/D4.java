package Second;

public class D4 {
	public static void main(String[] args) {
		String s="Hi this is Harish";
		String[] s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--){
			String s2 =s1[i];
			for(int j= s2.length()-1; j>=0; j--){
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
