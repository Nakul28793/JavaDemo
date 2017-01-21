package com.BT.Collections;

import java.util.HashSet;
import java.util.Set;

public class Test13{
	public static void main(String[] args) 
	{
		Set<Human13> humans = new HashSet<Human13>();
		humans.add(new Human13(13));
		humans.add(new Human13(33));
		humans.add(new Human13(21));
		humans.add(new Human13(21));
	}
}

class Human13 {
	Integer age;
	public Human13(int age) {
		this.age = age;
	}
}
