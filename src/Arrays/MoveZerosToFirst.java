package Arrays;

public class MoveZerosToFirst {
	public static void main(String[] args) {
		int[] arr={1,0,5,94,0,6};
		int count=arr.length-1;
		for(int i=arr.length-1; i>=0; i--){
			if(arr[i]!=0){
				arr[count]=arr[i];
				count--;
			}
		}
		for(int j=count;j>=0;j--){
			arr[count]=0;
			count--;
		}
		
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
	}

}
