package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class CollBasics {

	public CollBasics() {
		System.out.println("in cons");
		/*
		 * Scanner s = new Scanner(System.in); String word = s.nextLine(); s.close();
		 * System.out.println(word);
		 */
		arrayListTest();
		
		//vectorTest();
		
		//hashSetTest();
		//linkedHashSetTest();
		//treeSetTest();
		
//		hashMapTest();
//		linkedHashMapTest();
//		treeMapTest();
//		concurrentHashMapTest();
		
		
	}

	private void linkedHashSetTest() {
		// TODO Auto-generated method stub
		
	}

	private void treeSetTest() {
		// TODO Auto-generated method stub
		
	}

	private void hashSetTest() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		System.out.println("in main");
		new CollBasics();
		concurrentHashMapTest();
		//vectorTest();
	}
	
	private void vectorTest() {
		Vector<String> vect = new Vector<>();
		vect.add("a ");
		vect.add("three s");
		vect.addElement("four");
		
		//System.out.println(vect.get(1));
		Enumeration<String> en = vect.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
	
	private void arrayListTest() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(3);
//		arrayList.add(2);
//		arrayList.add(1);
//		arrayList.add(44);
//		arrayList.add(3);
//		arrayList.add(22);
//		arrayList.add(1);
//		arrayList.add(4);
//		arrayList.remove(0);
		
		/*Iterator<Integer> itr =  arrayList.iterator();
		 *
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		for (Integer m : arrayList) {
			System.out.println(m.toString());
		}
		
		
	}
	
	private void hashTableTest() {
		Hashtable<Integer, String> hashTable  = new Hashtable<Integer, String>();
		hashTable.put(3, "three");
		hashTable.put(null, null);
		hashTable.put(1,"onee");
		hashTable.put(2,"two");
		hashTable.put(4, "four");
		
		for ( Integer keySet : hashTable.keySet()) {
			System.out.println(keySet);
		}
		
		for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.println(entry.getValue());
			
		}
		
	}
	
	private void hashMapTest() {
		//HashMap<Integer, String> myHmap  = new HashMap<Integer, String>();
		Map<Integer, String> myHmap  = new HashMap<Integer, String>();
		
		//myHmap.put(3, null);
		myHmap.put(3, "three");
		myHmap.put(null, null);
		myHmap.put(1,"onee");
		myHmap.put(2,"two");
		myHmap.put(4, "four");
		
		for ( Integer keySet : myHmap.keySet()) {
			System.out.println(keySet);
		}
		
		for (Map.Entry<Integer, String> entry : myHmap.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.println(entry.getValue());
			
		}
	}
	private void linkedHashMapTest() {
		LinkedHashMap<Integer, String> myHmap  = new LinkedHashMap<Integer, String>();
		//Map<Integer, String> myHmap  = new LinkedHashMap<Integer, String>();
		
		//myHmap.put(3, null);
		myHmap.put(3, "three");
		myHmap.put(null, null);
		myHmap.put(1,"onee");
		myHmap.put(2,"two");
		myHmap.put(4, "four");
		
		for ( Integer keySet : myHmap.keySet()) {
			System.out.println(keySet);
		}
		
		for (Map.Entry<Integer, String> entry : myHmap.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.println(entry.getValue());
			
		}
	}
	private void treeMapTest() {
		TreeMap<Integer, String> myHmap  = new TreeMap<Integer, String>();
		//Map<Integer, String> myHmap  = new TreeMap<Integer, String>();
		
		//myHmap.put(3, null);
		myHmap.put(3, "three");
		myHmap.put(null, null);
		myHmap.put(1,"onee");
		myHmap.put(2,"two");
		myHmap.put(4, "four");
		
		for ( Integer keySet : myHmap.keySet()) {
			System.out.println(keySet);
		}
		
		for (Map.Entry<Integer, String> entry : myHmap.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.println(entry.getValue());
			
		}
	}
	private static void concurrentHashMapTest() {
		ConcurrentHashMap<Integer, String> myHmap  = new ConcurrentHashMap<Integer, String>();
		//myHmap.put(3, null);
		myHmap.put(3, "three");
		myHmap.put(null, null);
		myHmap.put(1,"onee");
		myHmap.put(2,"two");
		myHmap.put(4, "four");
		
		for ( Integer keySet : myHmap.keySet()) {
			System.out.println(keySet);
		}
		
		for (Map.Entry<Integer, String> entry : myHmap.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.println(entry.getValue());
			
		}
	}


}
