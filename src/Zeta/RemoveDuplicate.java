package Zeta;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		 int [] a = {1,3,4,3,5,4,7};
		 Set<Integer> set = new LinkedHashSet<>();
		 for(int i=0; i<a.length;i++){
			 set.add(a[i]);
		 }
		System.out.println(set);
	}
}
