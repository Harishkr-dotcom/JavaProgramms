package Integers;

public class PrimeNumberbetween {
	public static void main(String[] args) {
		for(int k=1;k<=100;k++){
			int  n=k;
			boolean flag=true;
			for(int i=2;i<n;i++){
				if(n%i==0){
					flag=false;
				}
			}
			if(flag==true){
				System.out.println("It is a prime number"+n);
			}else{
				System.out.println("It is not a prime number"+n);
			}
		}
	}

}
