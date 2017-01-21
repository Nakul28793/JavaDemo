package MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 

public class HashMapTest {
 public static void main(String args[]){
     
 
    System.out.println("-----1. create Map---");
    Map<String,String> hashMap=new HashMap<String,String>();
 
    System.out.println("\n-----2. put key-value pair in Map ---");
    hashMap.put("Amit", "Kothari");
    hashMap.put(null, null);
    //hashMap.put(null, "Arpit");
    //hashMap.put(null, "Kothari");
    //hashMap.put(null, null);
    
    
    System.out.println("\n-----3. get method returns value corresponding to key ---");
    System.out.println("hashMap.get(Amit) : "+hashMap.get("Amit"));
  
    

    System.out.println("\n-----4. containsKey method returns true if map "
                                      + "contains a mapping for the specified key ---");
    System.out.println("hashMap.containsKey(Amit) : "+hashMap.containsKey("Amit"));
    
    System.out.println("\n-----5. containsValue method returns true if map maps one "
                                      + "or more keys to the specified value. ---");
    System.out.println("hashMap.containsValue(\"Kothari\") : "+hashMap.containsValue("Kothari"));
    
    //System.out.println("hashMap.remove(11) : "+hashMap.remove(11));
    
    System.out.println("\n-----6. size ---");
 
    System.out.println("hashMap.size() : "+hashMap.size());
    
    
    System.out.println("\n---obtain entrySet from Map---");
	Set<Entry<String,String>> entrySet = hashMap.entrySet();
	System.out.println("---now iterate on entrySet using enhanced for loop---");
	for (Entry<String,String> entry : entrySet) 
	{
		//System.out.println(entry);
		//OR
		System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		//if you uncomment below code, it will throw java.util.ConcurrentModificationException
        //entrySet.remove("Arpit");
	}
 
 }
 
}