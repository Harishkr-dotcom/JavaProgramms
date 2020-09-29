package Second;

import java.util.HashMap;
import java.util.Map;

public class D2 {
	public static void main(String[] args) {
		String s1= "Hi this is is done by Harish";
		String[] words = s1.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String s2: words){
			if(map.containsKey(s2)){
				map.put(s2, map.get(s2)+1);
			}else{
				map.put(s2.toLowerCase(), 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}
