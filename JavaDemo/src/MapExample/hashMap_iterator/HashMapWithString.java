package MapExample.hashMap_iterator;
/*
Using entrySet() and for loop
Using keyset() and for loop
Using Iterator interface
*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithString {
	
	public static void main(String args[]) 
	{
		String s1="Arpit";
		String s2=new String("Arpit");

		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put(s1, 11);
		hashMap.put(s2, 12);

		System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
		Iterator<String> keyIterator = hashMap.keySet().iterator();
		while (keyIterator.hasNext()) 
		{
			System.out.println(keyIterator.next());
		}

		System.out.println("\n---obtain keySet from Map---");
		Set<String> keySet = hashMap.keySet();
		System.out.println("---now iterate on keySet using enhanced for loop---");
		for (String key : keySet) 
		{
			System.out.println(key);
			System.out.println(key  +" :: "+ hashMap.get(key));
            //if you uncomment below code, it will throw java.util.ConcurrentModificationException
            //hashMap.remove("Arpit");
		}

		System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
		Iterator<Integer> valueIterator = hashMap.values().iterator();
		while (valueIterator.hasNext()) 
		{
			System.out.println(valueIterator.next());
		}

		System.out.println("\n---obtain values from Map---");
		Collection<Integer> collection = hashMap.values();
		System.out.println("---now iterate on values using enhanced for loop---");
		for (Integer value : collection) 
		{
			System.out.println(value);
		}

		System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
		
		Iterator<Entry<String, Integer>> entryIterator = hashMap.entrySet().iterator();
		while (entryIterator.hasNext()) 
		{
			//System.out.println(entryIterator.next());
			//OR
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) entryIterator.next();
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
			//You can remove elements while iterating.
            //entryIterator.remove();
		}

		System.out.println("\n---obtain entrySet from Map---");
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		System.out.println("---now iterate on entrySet using enhanced for loop---");
		for (Entry<String, Integer> entry : entrySet) 
		{
			//System.out.println(entry);
			//OR
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			//if you uncomment below code, it will throw java.util.ConcurrentModificationException
            //entrySet.remove("Arpit");
		}

	}

}
