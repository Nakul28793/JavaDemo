package com.BT.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester11
{
	public static void main(String[] args) 
	{
		List<Human11> humans = new ArrayList<Human11>();
		humans.add(new Human11(13));
		humans.add(new Human11(33));
		humans.add(new Human11(21));
		humans.add(new Human11(21)); // line 1
		
		HumanComparator c = new HumanComparator(); // line 2
		Collections.sort(humans, c); // line 3
		System.out.print(humans.get(0).age);
		Collections.sort(humans); // line 4
		System.out.print(humans.get(0).age);
	}
}

class Human11 implements Comparable<Human11> 
{
	Integer age;
	public Human11(int age) {
		this.age = age;
	}
	public int compareTo(Human11 h) {
		return h.age.compareTo(this.age);
	}
}

class HumanComparator implements Comparator<Human11> {
	public int compare(Human11 h1, Human11 h2) {
		return h1.age.compareTo(h2.age);
	}
}