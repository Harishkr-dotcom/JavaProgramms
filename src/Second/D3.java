package Second;

public class D3 {
	public static void main(String[] args) {
		for(int k=1;k<=100;k++){
		boolean flag=true;
		int no=k;
		for(int i=2; i<no;i++){
			if(no%i==0){
				flag = false;
			}
		}
		if(flag==true){
			
			System.out.println("Prime is "+k);
		 }
		}
	}

}
