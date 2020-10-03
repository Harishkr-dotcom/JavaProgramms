package Strings;

public class FindLargestinSentence {
	//output how
	//       Hi
	public static void main(String[] args) {
		String s="Hi how are you";
		String[] arr = s.split(" ");
		String largest = arr[0];
		String smallest = arr[0];
		for(String s2:arr){
			if(largest.length()<s2.length()){
				largest=s2;
			}
		}
		System.out.println(largest);
		for(String s3:arr){
			if(smallest.length()>s3.length()){
				smallest=s3;
			}
		}
		System.out.println(smallest);
	}
}
