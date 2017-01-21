package com.BT.Exceptions;
/*
 * 1 	Add throws IOException declaration to call() at line 3
 * 5 	Surround code from line 11 to 13 with try { } catch (Exception e) {} block
 */
import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class Tester11 {
	static void call() { // line 3
		File file = new File("javachamp.dat"); // line 4
		file.createNewFile(); // line 5
		throw new IllegalArgumentException(); // line 6
	}

	public static void main(String[] args) {
		call(); // line 11
		DateFormat df = DateFormat.getDateInstance(); // line 12
		Date parse = df.parse("12.11.2009"); // line 13
	}
}