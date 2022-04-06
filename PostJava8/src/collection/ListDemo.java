package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

// ArrayList is best used for Retrieval Linked List is worst for that
// LinkedList is best for insertion and deletion in the middle ..AL is worst for that
// AL is Resizable or growable Array..
// LL uses underlying data structure Doubly linked list
// AL implements RandomAcessInterface LL doesnot 

public class ListDemo {

	//Some methods in List Interface
	//boolean addAll((int paramInt , Collection<? extends E> paramCollection);
	//E get(int param
	//E set(int pos, E paramE
	//void add(int pos, E ParamE)
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("rag");
		al.add("moh");
		al.add("any");
		al.add("pari");
		al.add("anj");
		al.add("rag");
		//al.add(null);
		//al.add(null);//allows any no of null values
		al.add(1, "any");
		
		Collections.sort(al); //allows nulls but this fails

		for (String integer : al) {
			System.out.println(integer);
		}
		
		//Iterator<Integer> itr = al.iterator();
		//for(String intg: al) {
		//	System.out.println(intg);
		//}
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(410);
		ll.add(240);
		ll.add(20);
		ll.add(330);
		ll.add(140);
		ll.add(250);
		//ll.add(null);
		ll.add(1, 200);
		Collections.sort(ll);

		for (Integer integer : ll) {
			System.out.println(integer);
		}
	}

}
