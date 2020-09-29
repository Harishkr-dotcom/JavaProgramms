package First;

public class Class3 
{
	//WAP to add the even and odd numbers given in a Number
	public static void main(String[] args) 
	{
		int num = 2365;
		int even=0, digit =0, odd=0;
		while(num!=0)
		{
			digit=num%10;
			if(digit%2==0)
			{
				even += digit;
			}else{
				odd += digit;
			}
			num = num/10;
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
