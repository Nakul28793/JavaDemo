package com.BT.DeclarationsAndAccessControl;

public class Tester1 {
	
	static int x = 4;
	int y = 9;
	public Tester1() {
		System.out.print(this.x); // line 7
		printVariables();
	}
	public static void printVariables() {
		System.out.print(x); // line 12
		System.out.print(y); // line 13
	}
	public static void main(String... args) { // line 16
		new Tester1();
	}
}
