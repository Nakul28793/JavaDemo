package com.BT.Strings;
/*
 * 
We are looking for a match of not least and not more than one occurrence of a letter between 'a' to 'f' and 
followed by at least one occurrence of a digit

start() returns the index of the matched literal

group() returns the matched literal


Compile() and matcher() are from Pattern class.

Start() and group() are from Matcher class.

"[a-f]\\d -- first char wud be a-f,second char wud be digite

Start() -- will return first matching index found

group() -- will return found groups amtching REGEXP

Note: The Regex ([a-f]\\d+) is searching for one or more digit preceded by a single character. That's why it is not considering the character e.

*/
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Tester12 {

	public static void main(String[] args) 
	{
	    Pattern p = Pattern.compile("[a-f]\\d+");

	    Matcher m = p.matcher("ab34ef0");

	    while(m.find()) 
	    {

	    	System.out.print(m.start()+" "+m.group()); //1 b345 f0

	    }

	}

}
