package Arrays;

public class FindDuplicatesBetweenTwoArray {
	//output=1, 89, 5
	public static void main(String[] args) {
		int[] a= {1,3,48,89,5};
		int[] b= {10,2,1,5,89};
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}
	}
}
