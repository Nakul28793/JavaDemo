package com.BT.Generics;
/*
How can this program be modified to make use of appropriate generic types? (one modification for each line) 
# 	Answers     No Answer                                                                  Correct Choice 	Your Choice
1 	replace line 1 with List<Integer> ids = new ArrayList<Integer>(); 						1	
2 	replace line 1 with List<Long> ids = new ArrayList<Long>(); 		
3 	replace line 2 with Map<Integer,String> students = new HashMap<Integer,String>(); 		
4 	replace line 2 with Map<String,Integer> students = new HashMap<String,Integer>(); 		4
5 	replace line 3 with int x = students.get("Jimmy"); 										5
 */
import java.util.*;

public class Test12 {

	public static void main(String[] args) 
	{
		List ids = new ArrayList(); // Line 1

		ids.add(123);

		ids.add(999);

		
		Map students = new HashMap(); // Line 2

		students.put("Jess",ids.get(0));

		students.put("Jimmy",ids.get(1));

		
		int x = ((Long)students.get("Jimmy")).intValue(); // Line 3

	}
}
