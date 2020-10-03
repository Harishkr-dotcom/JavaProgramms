package Integers;

public class Palendrome {
	public static void main(String[] args) {
		int n=121;
		int temp=n;
		int rev=0;
		while(n!=0){
			int rem= n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp){
			System.out.println("It is palendrom");
		}else{
			System.out.println("It is not palendrom");
		}
	}

}
