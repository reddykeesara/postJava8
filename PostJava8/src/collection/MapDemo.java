package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


//Map supports key value pairs
//size, ismpty, containskey,contains value , get, put, remove,putall, clear
//Set<K> keySet(), Collection<v> values(), Set<Entry<K,V>> entrySet()
//are some of its methods

//SortedMap interface extends Map
//SortedMap<K,V> subMap(K fromKey, K toKey);
//SortedMap<K,V> headmap(K tokey);
//tailmap , firstKey, lastKey are someof its methods


//NavigableMap interface extneds SortedMap
//Map.Entry<K,V> lowerEntry(K key); lowerKey, floorkey, ceilingEntry, ceiligkey
// higherkey, firstEntry, lastentry are some of its methods

//Hashmap imlements mapa unsorted, unordered 
//HashTable impleents map Threadsafe
//hashmap allows a key with null value, hashtable doesnt
//LinkedHashmap  implements map insertion order maintained, slower insertion and deletion, faster iteration

//Treemap implements navigablemap
public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map =  new HashMap<>();
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		Map<String, Cricketer>  hashmap = new Hashtable<String, Cricketer>();
		hashmap.put("Bradman", new Cricketer("Bradman", 9900));
		hashmap.put("Sachin", new Cricketer("Sachin", 14000));
		hashmap.put("Dravid", new Cricketer("Dravid", 12000));
		hashmap.put("Ponting", new Cricketer("Ponting", 11000));
		//System.out.println(hashmap.get("Ponting"));
		//System.out.println(hashmap.get("Lara"));
		hashmap.put("Ponting",new Cricketer("Ponting", 11800));
		
		for ( String key :hashmap.keySet()) {
			//System.out.println(key);
			System.out.println(hashmap.get(key));
		}
		
		for ( Map.Entry<String, Cricketer> entry :hashmap.entrySet()) {
			//System.out.println(key);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//System.out.println(hashmap);
		System.out.println();
		
		Map<String, Cricketer>  treemap = new TreeMap<String, Cricketer>();
		treemap.put("Bradman", new Cricketer("Bradman", 9900));
		treemap.put("Sachin", new Cricketer("Sachin", 14000));
		treemap.put("Dravid", new Cricketer("Dravid", 12000));
		treemap.put("Ponting", new Cricketer("Ponting", 11000));
		//System.out.println(treemap.get("Ponting"));
		//System.out.println(treemap.get("Lara"));
		treemap.put("Ponting",new Cricketer("Ponting", 11800));
		
		for ( String key :treemap.keySet()) {
			//System.out.println(key);
			System.out.println(treemap.get(key));
		}
		
		//System.out.println(treemap);


		
	}
}

class HashMapDemo{
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 11);
		map.put("bbb", 22);
		map.put("ccc", 33);
		map.put("ddd", 44);
		System.out.println("size "+map.size());
		if(map.containsKey("abc")) {
			Integer a = map.get("abc");
			System.out.println("value "+a);
		}
	}
}


class FailFastExample {
    public static void main(String[] args)
    {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");
  
        Iterator iterator = cityCode.keySet().iterator();
  
        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));
  
            // adding an element to Map
            // exception will be thrown on next call
            // of next() method.
            cityCode.put("Istanbul", "Turkey");
        }
    }
}

 class FailFastExample2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
  
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                // will not throw Exception
                itr.remove();
            }
        }
  
        System.out.println(al);
  
        itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 3) {
                // will throw Exception on
                // next call of next() method
                al.remove(3);
            }
        }
    }
}
 
 class FailSafe {
	    public static void main(String args[])
	    {
	        CopyOnWriteArrayList<Integer> list
	            = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
	        Iterator itr = list.iterator();
	        while (itr.hasNext()) {
	            Integer no = (Integer)itr.next();
	            System.out.println(no);
	            if (no == 8)
	  
	                // This will not print,
	                // hence it has created separate copy
	                list.add(14);
	        }
	    }
	}
 
  class FailSafeItr {
	    public static void main(String[] args)
	    {
	  
	        // Creating a ConcurrentHashMap
	        ConcurrentHashMap<String, Integer> map
	            = new ConcurrentHashMap<String, Integer>();
	  
	        map.put("ONE", 1);
	        map.put("TWO", 2);
	        map.put("THREE", 3);
	        map.put("FOUR", 4);
	  
	        // Getting an Iterator from map
	        Iterator it = map.keySet().iterator();
	  
	        while (it.hasNext()) {
	            String key = (String)it.next();
	            System.out.println(key + " : " + map.get(key));
	  
	            // This will reflect in iterator.
	            // Hence, it has not created separate copy
	            map.put("SEVEN", 7);
	        }
	    }
	}
  
  