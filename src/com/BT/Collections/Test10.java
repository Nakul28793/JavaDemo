package com.BT.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10{
	
	public static void main(String[] args) 
	{
		List<Human10> humans = new ArrayList<Human10>();
		humans.add(new Human10(13));
		humans.add(new Human10(33));
		humans.add(new Human10(21));
		humans.add(new Human10(21));
		Collections.sort(humans);
		System.out.print(humans.get(0).age);
		System.out.print(humans.size());
	}
}

class Human10 implements Comparable<Human10> 
{
	int age;
	
	public Human10(int age) {
	this.age = age;
	}
	
	public int compareTo(Human10 h) {
	return h.age.compareTo(this.age);
	}
}
