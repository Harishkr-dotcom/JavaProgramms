package Strings;

public class CountStrings {
	public static void main(String[] args) {
		String s = "TTTEESSTTTIIIINNNNGGG";
		StringBuilder b = new StringBuilder();
		int count=1;
		char current = 0;
		for(int i=0; i<s.length()-1;i++){
			if(s.charAt(i)!=s.charAt(i+1)){
				 b.append(s.charAt(i)+ String.valueOf(count));
				 count=1;
			}else{
				count++;
			}
			
		}
		System.out.println(b);
	}

}
