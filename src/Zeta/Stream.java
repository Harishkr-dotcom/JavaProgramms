package Zeta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		 List<Integer> number = Arrays.asList(12,24,15,18,20,10,7,6,9);
	     List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
	     System.out.println(square);
	     number.stream().filter(k ->k%2==0).map(x->x*x).sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
	}
}
