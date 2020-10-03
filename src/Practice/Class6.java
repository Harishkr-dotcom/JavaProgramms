package Practice;

public class Class6 {
	public static void main(String[] args) {
		//print 1234hi6789hi upto 100
		/*String s="Hi";
		int count=1;
		for(int i=1;i<=50;i++){
			if(count<=4){
				System.out.print(i);
				count++;
			}else{
				System.out.print("Hi");
				count=1;
			}
		}*/
		
		String s="Hi";
		for(int i=1;i<=50;i++){
			if(i%5==0){
				System.out.print("Hi");
			}else{
				System.out.print(i);
			}
		}
		
	}

}
