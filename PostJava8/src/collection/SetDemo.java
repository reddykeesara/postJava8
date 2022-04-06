package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set doesnt allow duplication
//sortedset interface extends set
//sortedSet<E> 
//subset headset tailset  first last are methods in sorted set
//NavigableSet Interface extends sortedset
//has E lower(E e), floor , ceiling , higher, pollFirst, pollLast methods
// HashSet implements Set unordered,unsorted - iterates in random order uses kind of hasing impl
//LinedHashSet implemnts Set maintains order of insertion, unsorted uses hashing
//TreeSet implemenet set , NavigableSet(means it impl SortedSet also) sorted-natural order
//
public class SetDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Sachin");
		hashSet.add("Dravid");
		hashSet.add("Sachin");
		hashSet.add(null);
		hashSet.add(null);//null accepted but only once
		
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(hashSet);
		
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("Sachin");
		lhs.add("Dravid");
		lhs.add("Sachin");
		lhs.add(null);
		lhs.add(null);//null accepted but only once
		
		lhs.forEach(System.out::println);
		
		System.out.println(hashSet);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Sachin");		
		treeSet.add("Ganguly");
		treeSet.add("Sachin");
		treeSet.add("Dravid");
		//treeSet.add(null); null not accepted in treeset
		System.out.println(treeSet);
		
		Set<Alien> treeSetAliens = new TreeSet<>();
		Alien alien = new Alien();
		alien.setAid(1);
		alien.setAname("rag");
		alien.setTech("java");
		
		Alien alien2 = new Alien();
		alien2.setAid(2);
		alien2.setAname("moh");
		alien2.setTech("c");
		
		Alien alien3 = new Alien();
		alien3.setAid(3);
		alien3.setAname("anan");
		alien3.setTech("java");
		
		Alien alien4 = new Alien();
		alien4.setAid(4);
		alien4.setAname("pari");
		alien4.setTech("noth");
		
		treeSetAliens.add(alien);
		treeSetAliens.add(alien2);
		treeSetAliens.add(alien3);
		treeSetAliens.add(alien4);
		
		
		System.out.println(treeSetAliens);
		
		///////////////////////////////////
		TreeSet<Integer> numset = new TreeSet<Integer>();
		numset.add(55);
		numset.add(25);
		numset.add(35);
		numset.add(5);
		numset.add(45);
		System.out.println(numset.lower(25));
		System.out.println(numset.floor(25));
		System.out.println(numset.higher(25));
		System.out.println(numset.ceiling(25));
		
		
	}
}
