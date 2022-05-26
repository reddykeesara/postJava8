package interviewQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

//find duplicates in a string
public class DuplicateCharInString {

	public static void main(String[] args) {
		System.out.println(findDuplicates1("raghunath reddy"));
		System.out.println(findDuplicates2("raghunath reddy"));
		System.out.println(findDuplicates3("raghunath reddyy"));

	}

	//time complexity O(n2)
	static Set<Character> findDuplicates1(String name) {
		Set<Character> dups = new LinkedHashSet<>();
		for (int i = 0; i < name.length(); i++) { // O(n)
			for (int j = i + 1; j < name.length(); j++) { // O(n2) order of n square
				if (name.charAt(i) == name.charAt(j)) {
					dups.add(name.charAt(j));
				}
			}
		}
		return dups;
	}

	//time complexity O(n), space complexity O(n)
	static Set<Character>  findDuplicates2(String name ){
		Set<Character> dups = new LinkedHashSet<>();
		//ascii for a is 97
			int[] arrayForChar = new int[256];
			for(int i=0;i<name.length();i++) { //O(n)
				arrayForChar[name.charAt(i)] = arrayForChar[name.charAt(i)]+1;
			}
			for (int i=0;i<256;i++) {  //O(n)
				if(arrayForChar[i] > 1) {
					dups.add((char) i);
				}
			}
			return dups;
	}

	//reduced time and space complexity
	private static Set<Character> findDuplicates3(String name) {
		Set<Character> dups = new LinkedHashSet<>();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (countMap.containsKey(name.charAt(i))) {
				countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1);
			} else {
				countMap.put(name.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				dups.add(entry.getKey());
			}
		}

		return dups;
	}
}
