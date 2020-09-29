package Telegram;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number of Prime number");
		int start = sc.nextInt();	
		System.out.println("Enter last number of Prime number");
		int end = sc.nextInt();
		for(int i=start; i<=end; i++){
			int k=i;
			boolean flag=true;
			for(int j=2;j<k;j++){
				if(k%j==0){
					flag=false;
				}
			}
			if(flag==true){
				System.out.println("Number "+k+" is a prime number");
			}else{
				System.out.println("Number "+k+" is not a prime number");
			}
		}
	}
}
