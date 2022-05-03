package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;


/** Remove duplicates from a List   **/
public class RemListDups {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(2,3,4,5,4,6,3,7,8,9,6,1,2,4,6,9));
		//int[] al = {2,3,4,5,3,4,6};
		
		List<Integer> l ;
		//using iterator
		//l = removeDuplicates(al);
		
		//add to set and back to list
		//l = removeDuplicates2(al);
		
		//using stream api
		l = removeDuplicates3(al);
		
		System.out.println(l);
		
	}

	//using iterator
	private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> al) {
		Iterator<Integer> itr = al.iterator();
		ArrayList al2  = new  ArrayList<>();
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			
			Integer integer = (Integer) iterator.next();
			if(!al2.contains(integer)) {
				al2.add(integer);
			}
			
		}
		return al2;
	}
	
	//add to set and back to list
	private static ArrayList<Integer> removeDuplicates2(ArrayList<Integer> al) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.addAll(al);
		al.clear();
		al.addAll(lhs);
		lhs.clear();
		
		return al;
	}
	
	
	//using java8 streams
	private static List<Integer> removeDuplicates3(ArrayList<Integer> al) {
		
		List<Integer> newList = al.stream().distinct().collect(Collectors.toList());
		return newList;
		
	}
}
