package Integers;

public class Armstrong {
	//153 = (1*1*1)+(5*5*5)+(3*3*3)  
	//output=1+125+27=153  
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int sum=0;
		while(n!=0){
			int rem= n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(sum);
		if(temp==sum){
			System.out.println("It is a Armstrong");
		}else{
			System.out.println("It is not a armstrong");
		}
	}
}
