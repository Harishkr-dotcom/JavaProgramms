package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromUnsortedArray {
	public static void main(String[] args) {
		int[] a = {7,1,2,7,8,9,9,1};
		Arrays.sort(a);
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1]){
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j+1;i++){
			System.out.println(a[i]);
		}
		//======================================
		 Set<Integer> set = new LinkedHashSet<>();
		 for(int i=0; i<a.length;i++){
			 set.add(a[i]);
		 }
		 System.out.println(set);
	
	}
}
