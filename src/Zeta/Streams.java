package Zeta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> product = Arrays.asList("iphone", "iphonecharger", "ipad", "android","bag", "shirt");
		//iterate and print
		List<String> abc = product.stream().filter(ele ->! ele.equals("ipad")).collect(Collectors.toList());
		abc.forEach(ele-> System.out.println(ele));
		//iterate and print having length greater than 4
		product.stream().filter(s->s.length()>=4).forEach(s-> System.out.println("having >4 "+s));
		//using limit we can limit output
		product.stream().filter(s->s.length()>=4).limit(5).forEach(s-> System.out.println("having >1 limits "+s));
		
		List<String> names = Arrays.asList("Harish","Rama","Krishna","sakamma","RRIT","Bengalore");
		//convert tht output into upper case using the map to upper case
		//manupulate the output after filtering
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//using  sorted 
		names.stream().filter(s->s.length()>3).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println("Sorted "+s));
		//Using collector to collect the into list
		List<String> updatedlist = names.stream().filter(s->s.length()>3).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(updatedlist);
		
		//print the unique number and sort it
		List<Integer> number = Arrays.asList(7,2,6,13,65,23,7,6,13,9,31,100,36,9,36);
		number.stream().distinct().sorted().forEach(s-> System.out.println(s));
		
	}
}
