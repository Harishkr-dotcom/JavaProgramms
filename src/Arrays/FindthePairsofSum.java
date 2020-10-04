package Arrays;

public class FindthePairsofSum {
	//output=2
	public static void main(String[] args) {
		int[] a= {2, 7, 6, 8, 4};
		int sum=10;
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
