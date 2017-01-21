package com.BT.Generics;
/*
 * Type mismatch, can't convert from List<String> to List<Object> 
 * 
 * Compilation error at line 2,Type mismatch, cannot convert from List<String> to List<Object>
 */
import java.util.ArrayList;

import java.util.List;

public class Tester1 {

	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>();//line 1

        List<Object> list2 = list1;//line 2

        list2.add(new Integer(12));//line 3

        System.out.println(list2.size());//line 4

	}

}
