package com.BT.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test18 {
	
	public static void main(String[] args) 
	{
		String jc = "javachamp_champ2012champ";

		Pattern p = Pattern.compile(".{4}c+(m)*"); //line 1

	    Matcher m = p.matcher(jc);

	    while(m.find()) 
	    {
	    	System.out.print(m.start()); //0615
	    }

	}
}

/*
 * 
Explanation:

1: javacamp_c2012c correct answer if print m.group() not m.start()

Explanation:

.{4}c+(m)*

=====================

. = any character

{4} = four

c = 'c' character

+ =repeat

m = 'm' character

* = any number of time (or never)

We are looking for a character 'c' wich followes four(4) any type characters and it must be a character 'm' after this 'c'. This required 'm' shoud be found any time (e.g. 1,6, 1000...etc or never!!!)

javachamp_champ2012champ

j = 0

followes 3 any character and found 'c'

a = 6

followes 3 any character and found 'c'

2 = 15

followes 3 any character and found 'c'
 */
