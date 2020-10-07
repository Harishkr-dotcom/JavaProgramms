package Arrays;

import java.util.Collections;
import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList<Integer> ls= new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(90);
		
		System.out.println(Collections.max(ls));
	}

}
