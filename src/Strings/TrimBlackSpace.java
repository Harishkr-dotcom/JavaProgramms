package Strings;

public class TrimBlackSpace {
	public static void main(String[] args) {
		//There is a sentence with a many spaces i dont no how many space are there "Hi this   is   Harish";
		//write a menthod to change it to one space
		//output=Hi this is Harish
		String str = "Hi this   is    Harish";
		String[] arr = str.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].trim().isEmpty()) {
				System.out.print(arr[i]+" ");
				count++; //to count white spaces
			}
		}
		System.out.println(count);
	}
}


