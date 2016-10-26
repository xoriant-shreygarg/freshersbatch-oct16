package com.collections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class CollectionMain {

	public static void main(String[] args) {

		
		
		
		Set<String> hset = new TreeSet<String>();
		hset.add("gt");
		hset.add("nn");
		hset.add("cc");
		hset.add("nn");
		Iterator<String> itr = hset.iterator();		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");
		
		
		
		
		
		Map<String, Integer> hmap = new TreeMap<String, Integer>();
		hmap.put("ABC", 85);
		hmap.put("QSA", 66);
		hmap.put("BAG", 234);
		hmap.put("PQR", 234);

itr = hmap.keySet().iterator();
while(itr.hasNext()) {
	String key = itr.next();
	System.out.println(key + " - " + hmap.get(key));
}


		Integer x = hmap.get("QSA");
		
		Map<String, Integer> hmapSync = 
				Collections.synchronizedMap(hmap);
		
		
		
		Queue<String> queueList = new LinkedList<String>();
		queueList.offer("ABC");
		queueList.poll();
		
		Deque<String> dequeList = new LinkedList<String>();
		dequeList.addLast("PQR");
		dequeList.pollFirst();
		
		
		
		Vector<String> vec = new Vector<String>();
		vec.add("Ivan");
		vec.add("Tom");
		vec.add("Jerry");
		itr = vec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> nameAryList = new CopyOnWriteArrayList<String>();
		nameAryList.add("Ivan");
		nameAryList.add("Tom");
		nameAryList.add("Jerry");
		
		
		List<String> synchronizedArrayList = 
				Collections.synchronizedList(nameAryList);
		
		
		ListIterator listItr = nameAryList.listIterator();
		
		itr = nameAryList.iterator(); //Fail-fast iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
			nameAryList.add("Jenny");
		}
		for(int i=0;i<nameAryList.size();i++) {
			System.out.println(nameAryList.get(i));
		}
		
		
		List<String> nameList = new LinkedList<String>();
		nameList.add("Ivan");
		nameList.add("Tom");
		nameList.add("Jerry");
		itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		
	}

}
