package Integers;

public class Factorial {
	public static void main(String[] args) {
		int number=5;
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
