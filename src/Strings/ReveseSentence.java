package Strings;

public class ReveseSentence {
	public static void main(String[] args) {
		//Input="Hi this is Harish
		//Output=hsiraH si siht iH 
		String s= "Hi this is Harish";
		String[] strarray = s.split(" ");
		for(int i=strarray.length-1;i>=0;i--){
			String revstr = strarray[i];
			for(int j=revstr.length()-1;j>=0;j--){
				System.out.print(revstr.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		for(int i=0;i<strarray.length;i++){
			String revstr = strarray[i];
			for(int j=revstr.length()-1;j>=0;j--){
				System.out.print(revstr.charAt(j));
			}
			System.out.print(" ");
		}
				
	}

}
