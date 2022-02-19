package First;

import java.util.Arrays;

public class class13 {
	public static void main(String[] args) {
		String a= "aabbbcdeeefa";
		char[] arr = a.toCharArray();
		Arrays.sort(arr);
		boolean flag;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==a.charAt(i)){
				flag=true;
			}else{
				flag=false;
			}
		}
		if(flag=false){
			System.out.println("hi");
		}
		
		
	}

}
