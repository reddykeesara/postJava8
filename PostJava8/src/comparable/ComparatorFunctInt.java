package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFunctInt {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(2);
		values.add(3);
		values.add(1);
		values.add(5);
		values.add(4);
		
		//Comparator<Integer> c = (i, j) -> i>j?1:-1;
		//Collections.sort(values, c);
		
		//above code in one line
		Collections.sort(values, (i,j) -> i>j?1:-1);
		
		for(Integer i: values) {
			System.out.println(i);
		}
		
		//other Collections methods
		Collections.reverse(values);
		System.out.println(values);
		Collections.shuffle(values);
		System.out.println(values);
		
	}
}
