package Zeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SourceAndDestina {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Delhi", "Bangalore");
		hm.put("Hyberabad", "Mumbai");
		hm.put("Bangalore", "Chennai");
		hm.put("Mumbai", "Tirupathi");
		hm.put("Chennai", "Hyberabad");
		ArrayList<String> key = new ArrayList<>();
		ArrayList<String> value = new ArrayList<>();
		for(Map.Entry<String, String> entry: hm.entrySet()){
			key.add(entry.getKey());
			value.add(entry.getValue());
		}
		Set<String> source = new LinkedHashSet<>(key);
		Set<String> dest = new LinkedHashSet<>(value);
		source.retainAll(dest);
		key.removeAll(source);
		value.removeAll(source);
		System.out.println(key);
		System.out.println(value);
	}

}
