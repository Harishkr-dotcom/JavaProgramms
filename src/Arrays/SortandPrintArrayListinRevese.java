package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SortandPrintArrayListinRevese {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(50);
		arr.add(0);
		arr.add(20);
		arr.add(60);
		arr.add(70);
		Collections.sort(arr);
		for(int i=arr.size()-1;i>=0;i--){
			System.out.println(arr.get(i));
		}
	}

}
