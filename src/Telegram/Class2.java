package Telegram;

import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial of number");
		int number = sc.nextInt();
		int fact=1;
		if(number<0){
			System.out.println("Please provide positive number");
		}
		else{
		for(int i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("The factorial of given number is "+fact);
		}
	}
}
