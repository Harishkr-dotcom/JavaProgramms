package Zeta;

import java.util.ArrayList;
import java.util.Collections;

public class MaxProduct {
	public static void main(String[] args) {
		int[] arr= {5,8,1};
		int prouct = 0;
		ArrayList<Integer> arin = new ArrayList<>();
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				prouct = arr[i]*arr[j];
				arin.add(prouct);
			}
		}
		System.out.println(Collections.max(arin));
	}

}
