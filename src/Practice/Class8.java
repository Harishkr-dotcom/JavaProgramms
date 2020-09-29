package Practice;

import java.util.HashMap;
import java.util.Map;

public class Class8 {
	public static void main(String[] args) {
		//fing the first non repeated number in a string
		String a ="112233566";
		char[] s = a.toCharArray();
		HashMap<Character, Integer> hp= new HashMap<>();
		for(Character s1:s){
			if(hp.containsKey(s1)){
				hp.put(s1, hp.get(s1)+1);
			}else{
				hp.put(s1, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: hp.entrySet()){
			if(entry.getValue()==1){
			System.out.println(entry.getKey()+"="+entry.getValue());
			break;
			}
		}
	}

}
