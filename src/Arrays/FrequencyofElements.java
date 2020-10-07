package Arrays;

import java.util.HashMap;

public class FrequencyofElements {
	public static void main(String[] args) {
		int [] a={1,3,6,8,9,2,2,9};
		HashMap<Integer, Integer> hm= new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}else{
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm);
	}

}
