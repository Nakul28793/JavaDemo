package com.BT.DeclarationsAndAccessControl;

public class Tester {
	
	static int x = 4;
	public Tester() {
		System.out.print(this.x); // line 4
		Tester();
	}
	
	public static void Tester() { // line 8
		System.out.print(this.x); // line 9
	}
	
	public static void main(String... args) { // line 12
		new Tester();
	}
}
