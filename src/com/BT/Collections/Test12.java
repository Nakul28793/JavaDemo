package com.BT.Collections;

import java.util.HashSet;
import java.util.Set;

public class Test12{
	
	public static void main(String[] args) 
	{
		Set<Human12> humans = new HashSet<Human12>();
		humans.add(new Human12(13));
		humans.add(new Human12(33));
		humans.add(new Human12(21));
		humans.add(new Human12(21));
		System.out.print(humans.size()+" ");
		System.out.print(humans);
	}
}

class Human12 implements Comparable<Human12> {
	Integer age;
	public Human12(int age) {
		this.age = age;
	}
	public int compareTo(Human12 h) {
		return h.age.compareTo(this.age);
	}
	public String toString() {
		return ""+this.age;
	}
}
