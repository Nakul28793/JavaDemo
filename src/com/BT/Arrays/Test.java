package com.BT.Arrays;

public class Test {

    public static void main(String [ ] args)
    {
    	if (args.length == 1 |  args[1].equals("debug"))
    	//    Actual
    	//if (args.length == 1 | args[0].equals("debug"))
    	//if (args.length == 1 && args[0].equals("debug"))
    	{
    		System.out.println(args[0]); // 	An exception is thrown at run-time
        }
    	else
    	{
    		System.out.println("Release");
    	}        
    }
}
//Input debug

/*
An interesting and important difference:

- in C++/BASH/etc. args[0] contains the name and the path to the program running the main() (in this case "Test")

- in Java args[0] is actually the first parameter to the program (in this case "debug").

So a run-time java.lang.Array_Index_Out_Of_Bounds_Exception is thrown for the code above.

The "|" and "&" operators are checking both their operands, unlike the short circuit operators "||" and "&&" which try to be shorter by checking their right operand ONLY in case the first was not enough to determine the result.

To correct the code replace:

- "|" with "&&"

- args[1] with args[0]

then the output will be "debug".
*/