package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {

	// Collection interface has following methods
	// boolean add
	// boolean remove

	// int size
	// boolean isEmpty();
	// void clear();

	// boolean contains(Object
	// boolean containsAll(Collection<?>

	// boolean addAll(Collection<? extends E>
	// boolean removeAll(Collection<?>
	// boolean retainAll(Collection<?>

	// Iterator<E> iterator();

	public static void main(String[] args) {
		// Collection can only hold objects cant hold primitives
		List<Integer> integers = new ArrayList<>();
		integers.add(2);// autoboxing
		List<String> batsmen = new ArrayList<>();
		batsmen.add("sachin");
		batsmen.add("dravid");
		batsmen.add(0, "ganguly");
		batsmen.add("sachin"); // lisst allows duplicates
		System.out.println(batsmen.size());
		System.out.println(batsmen.contains("dravid"));

		Iterator<String> listItr = batsmen.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		
		//using lambda expression
		batsmen.forEach(System.out::println);

	//not working	
//		  for(Object string: listItr) {
//		  
//		  }
		 
	}

}
