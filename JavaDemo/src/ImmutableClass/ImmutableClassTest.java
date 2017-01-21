package ImmutableClass;
/*
Interview question :
	Should we make the class and methods both final?
		No, If we have made class final than there is no need to make methods final, 
		because final class cannot be extended and hence methods cannot be overridden.

Advantages of using Immutable  class :
	Thread safe - Immutable classes are thread safe, they will never create race condition.
	Key in HashMap - Immutable classes are can be used as key in Map (HashMap etc.)
	HashCode is cached - JVM caches the HashCode of Immutable classes used in application. JVM need not to calculate hashcode again. Hence, performance of application is improved significantly.
	If Immutable class throws Exception - If Immutable class throws Exception, they are never left in undesirable state.
 */
import java.util.HashMap;
import java.util.Iterator;
/*
 * http://www.somanyword.com/2014/05/how-to-make-any-class-immutable-in-java/
 * http://www.javamadesoeasy.com/2015/05/creating-immutable-class-in-java.html#uds-search-results
 */
/** Creating ImmutableClass
 * 1) Final class - Make class final so that it cannot be inherited
 */
final class ImmutableClass{
    
   /**
   * 2) private member variable -> Making member variables private ensures that fields 
                                   cannot be accessed outside class.
   * 3) final member variable -> Making member variables final 
                                   so that they can be assigned only once.
   */
    private final Integer id;	//Immutable member variable
    private final String name;	//Immutable member variable
    private final HashMap<Integer,String> map; //mutable member variable
 
    /** 4) Constructor -> Initialize all fields in constructor.
     *            assign all mutable member variable using new keyword.
     *  Constructor performing Deep Copy          
     */
    public ImmutableClass(Integer id, String name, HashMap<Integer,String> map)
    {	
    	System.out.println("Performing Deep Copy for Object initialization");
        this.id=id;
        this.name=name;
       
        //assign all mutable member variable using new keyword.
        this.map=new HashMap<Integer, String>(map);
        // OR
        /*HashMap<Integer,String> testMap=new HashMap<Integer,String>();
        Integer key;
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            key=it.next();
            testMap.put(key, map.get(key));
        }
        this.map=testMap;*/
    }
    
    
    /*public ImmutableClass(Integer id, String name, HashMap<Integer,String> map)
    {	
    	System.out.println("Performing Shallow Copy for Object initialization");
        this.id=id;
        this.name=name;
        this.map=map;

    }*/
               
    /* getter method for id.*/
    public Integer getId() {
       /** 5a) Integer is immutable class,
        *     any changes made to Integer object produces new Integer object.
        *     so return reference variable of Integer.
        */
        return id;
    }
 
    /* getter method for name.*/
    public String getName() {
       /** 5b) String is immutable class,
        *     any changes made to Sting object produces new String object.
        *     so return reference variable of String.
        */
        return name;
    }
 
    /* Method returns clone of HashMap. */
    public HashMap<Integer, String> getMap() {
       /** 5c) HashMap is mutable class,
        *     any changes made to HashMap object won't produce new HashMap object.
        *     so return copy/clone of object, not reference variable of HashMap.*/
        return (HashMap<Integer, String>) map.clone(); 
        //return map;  //Shallow Copy
    }
   
    /** 6) Don't provide setter methods in class */
 
}
 
 
/*
 * 
 * Main class for testing ImmutableClass
 */
public class ImmutableClassTest{
    public static void main(String[] args) {
      
       Integer localId=new Integer(1); //local
      
       String localName=new String("Arpit"); //local
      
        HashMap<Integer, String> localMap = new HashMap<Integer,String>(); //local
        localMap.put(11, "Audi");
      
        ImmutableClass immutableClass = new ImmutableClass(localId, localName, localMap);
       
 
        System.out.println("----Display ImmutableClass members before changing----");
        System.out.println(immutableClass.getId());		//	1
        System.out.println(immutableClass.getName());	//	Arpit
        System.out.println(immutableClass.getMap());	//	{11=Audi}
 
        System.out.println("----Comparing ImmutableClass members with local before changing----");
        System.out.println(localId==immutableClass.getId());		//true
        System.out.println(localName==immutableClass.getName());	//true
        System.out.println(localMap == immutableClass.getMap());	//false
 
       
        //change local
        localId = new Integer(2);
        localName = new String("Kothari");
        localMap.put(12, "Ferarri");
 
       
        System.out.println("\n----Display ImmutableClass members after changing----");
        System.out.println(immutableClass.getId());		//	1
        System.out.println(immutableClass.getName());	// 	Arpit
        System.out.println(immutableClass.getMap());	//	{11=Audi}
        
 
        System.out.println("----Comparing ImmutableClass members with local after changing----");
        System.out.println(localId==immutableClass.getId());		//false
        System.out.println(localName==immutableClass.getName());	//false
        System.out.println(localMap == immutableClass.getMap());	//false
        
        
        HashMap<Integer, String> hmTest  = immutableClass.getMap();
        hmTest.put(13, "BMW");
        System.out.println("immutableClass testMap after changing variable from accessor methods:"+immutableClass.getMap()); //{11=Audi}
 
    }
 
}
