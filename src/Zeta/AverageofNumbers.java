package Zeta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AverageofNumbers {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(7,3,5,2,436,466,896,6,6,5);
		//finnding the average
		double avg = number.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		// findint the square and averge
		double sqrnum = number.stream().map(s-> s*s).mapToInt(s->s).average().getAsDouble();
		System.out.println(sqrnum);
		// find the odd and even
		List<Integer> env = number.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(env);
		List<Integer> odd = number.stream().filter(s->s%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		//number starts with 4
		number.stream().map(s->String.valueOf(s)).filter(s->s.startsWith("4")).forEach(s->System.out.println(s));
		//find the duplicate
		Set<Integer> duplicatenum = number.stream().filter(s-> Collections.frequency(number, s)>1).collect(Collectors.toSet());
		System.out.println(duplicatenum);
		//sort i asce and desc order
		number.stream().sorted().forEach(s->System.out.print(s+" ,"));
		number.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.print(s+" ,"));
		//find the first lowets and highest number
		Integer lowest = number.stream().sorted().distinct().limit(1).findFirst().get();
		System.out.println(lowest+"dshkak");
		Integer highest = number.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		System.out.println(highest);
		//find the second lowets and highest number
		Integer lowest2 = number.stream().sorted().distinct().limit(3).skip(2).findFirst().get();
		System.out.println(lowest2+"lowest 2");
		Integer highest2 = number.stream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(2).findFirst().get();
		System.out.println(highest2);
	}

}
