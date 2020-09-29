package First;

public class class9 {
	static void disp(int n, int k){
		int res=n;
		while(res>0){
			System.out.print(res+",");
			res =  res-k;
		}
		
		while(res<=n){
			System.out.print(res+",");
			res= res +k;
		}
	}
	public static void main(String[] args) {
		int n=10;
		int k=2;
		disp(n, k);
	}
}
