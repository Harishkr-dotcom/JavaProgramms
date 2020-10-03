package Integers;

public class PrimeNumber {
	public static void main(String[] args) {
		int  n=5;
		boolean flag=true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=false;
			}
		}
		if(flag==true){
			System.out.println("It is a prime number "+n);
		}else{
			System.out.println("It is not a prime number "+n);
		}
	}

}
