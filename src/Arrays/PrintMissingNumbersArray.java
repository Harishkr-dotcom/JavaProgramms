package Arrays;

public class PrintMissingNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,5,7,9,10,15};
		int j=1;
		for(int i=0; i<a.length;i++){
			if(j==a[i]){
				j++;
			}else{
				System.out.print(j);
				i--;
				j++;
			}
		}
	}
//2,4,6,8,11,12,13,14
}
