package com.BT.Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Tester3 extends Thread 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {7,5,7,3};
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
		set.add(4);
		for(Integer value: set){
		System.out.print(value); //3457
		}
	}
}