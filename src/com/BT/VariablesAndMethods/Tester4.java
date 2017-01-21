package com.BT.VariablesAndMethods;

public class Tester4 {
	
	public static void main(String[] args) 
	{
		int x = 1;
		int y=0;
		while(++x<5) y++;
		System.out.println(y); //3
	}
}
/*
 * while(++x<5)

1st checks x will be increased now x=2;

while(2<5) condition true

y=1

next

while(3<5)condition true

y=2;

while(4<5)condition true

y=3;

while(5<5)condition false	
 */