package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesinGivenArray {
	public static void main(String[] args) {
		int [] a = {10,2,3,6,10};
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					System.out.println(a[i]+" Duplicates in the array");
				}
			}
		}
		
		//remove the duplicate
		for(int i=0; i<a.length; i++){
			int count=0;
			for(int j=0; j<a.length; j++){
				if(a[i]==a[j] && i!=j){
					count++;
				}
			}
			if(count==0){
				System.out.print(a[i]+",");
			}
		}
	}
}
