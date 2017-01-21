package com.BT.Collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Tester2
{
	public static void main(String[] args) 
	{
		TreeMap tree = new TreeMap();
		tree.put("aa", 1);
		tree.put("cc", 2);
		tree.put("ee", 3);
		tree.put("gg", 4);
		NavigableMap nvMap = tree.headMap("ee", false);
		System.out.print(nvMap); //{aa=1, cc=2}
	}
}