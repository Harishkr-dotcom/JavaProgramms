package Zeta;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Harsha {
	public static void main(String[] args) throws ScriptException {
		String [] arr = {"Persistant", "persistant", "", "", "PERSISTANT", "java","JavA","Anand"};
		Set<String> s = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++){
			s.add(arr[i].toLowerCase());
		}
		System.out.println(s);
		
		String[] arr1 = {"2", "+", "3", "*", "4"};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr1.length;i++){
			String s1=arr1[i];
			if(Character.isDigit(s1.charAt(0))){
				list.add(Integer.parseInt(arr1[i]));
			}
		}
		int a=list.get(0)+list.get(1);
		int b=a*list.get(2);
		System.out.println(b);
		
		String a1 ="harish";
		String a2 ="harish";
		String a3 ="harish";
		a3="harish1997";
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		/*ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	      ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
	      Object expResult1 = scriptEngine.eval(a);
	      System.out.println(expResult1);*/
	

	}

}
