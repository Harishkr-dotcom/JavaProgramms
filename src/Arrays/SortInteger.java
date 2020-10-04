package Arrays;

public class SortInteger {
	public static void main(String[] args) {
		int [] a = {5,9,3,1,8};
		int temp=0;
		//assending order
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){ 
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0; k<a.length; k++){
			System.out.print(a[k]+" ,");
		}
		//decending oder
		int temp1=0;
		for(int i1=0; i1<a.length; i1++){
			for(int j1=i1+1; j1<a.length; j1++){
				if(a[i1]<a[j1]){ 
					temp=a[i1];
					a[i1]=a[j1];
					a[j1]=temp;
				}
			}
		}
		for(int k1=0; k1<a.length; k1++){
			System.out.print(a[k1]+" ,");
		}
		
		
	}

}
