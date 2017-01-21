package com.BT.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Considering that all needed imports are there, what, inserted independently at line 1, will compile? Choose 4 
 # 	Answers     No Answer  					Correct Choice 	Your Choice
 1 	return new ArrayList<B>(); 				1
 2 	return new ArrayList<C>(); 				2
 3 	return new ArrayList<A>(); 		
 4 	return new ArrayList<? extends B>(); 	
 5 	return new LinkedList<B>(); 			5
 6 	return new PriorityQueue<B>(); 		
 7 	return new ArrayList(); 				7
 */
class A {
}

class B extends A {
}

class C extends B {
}

public class Test10 {

	public List<? extends B> ring() {

		// line 1
		//return new ArrayList<B>();
		//return new ArrayList<C>();
		//return new LinkedList<B>(); 
		//return new ArrayList();
		
		
	}

}
