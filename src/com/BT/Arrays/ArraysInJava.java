package com.BT.Arrays;

public class ArraysInJava {
	public static void main(String[] args)
    {
/*
Rule 1) : The size of an array can not be negative. If you give size of an array as negative, you don’t get any errors while compiling. 
		  But, you will get NegativeArraySizeException at run time.
*/		   
		
			int[] i = new int[-5];			//No Compile Time Error
 
			//You will get java.lang.NegativeArraySizeException at run time

/*
Rule 2) : The size of an array must be an integer or an expression which results an integer. Auto-widening is also allowed.         
 */
			
			int[] i1 = new int[10+5];    	//Array size can be an expression resulting an integer
 
			int[] i2 = new int[(byte)10];   //byte is auto-widened to int
 
			//int i3 = new int[10.25];     	//Compile Time Error : size can not be double
											//- Type mismatch: cannot convert from double to int
											//- Type mismatch: cannot convert from int[] to int

/*    
Rule 3) : Declaration and instantiating of an array strictly must be of same type. 
          No auto-widening, auto-boxing and auto-unboxing is allowed. But only auto-upcasting is allowed.
 */ 

			//Integer[] I = new int[5];		//Compile Time Error : Auto-Boxing not allowed //cannot convert from int[] to Integer[]
         
			//int[] i3 = new Integer[10];	//Compile Time Error : Auto-UnBoxing not allowed //cannot convert from Integer[] to int[]
			
			//long[] l = new byte[10];		//Compile Time Error : Auto-widening not allowed // cannot convert from byte[] to long[]
         
			Object[] o = new String[10];	//No Compile Time Error : Auto-Upcasting is allowed, String[] is upcasted to Object[]
			String[] someArray = (String[])o;

/*    
Rule 4) : The type of elements of an array must be compatible with type of the array object. 
          If you try to store non-compatible element in an array object, you will get ArrayStoreException at run time.
*/
           
			Object[] o4 = new String[10];	//No Compile Time Error : String[] is auto-upcasted to Object[]
			 
			//i.e array object of strings can be referred by array reference variable of Object type
			 
			o4[2] = "java";
			 
			o4[5] = 20;   //No Compile time error, 
			 
			//but you will get java.lang.ArrayStoreException at run time.

/*    
Rule 5) : If you are supplying the contents to the array without new operator, then it should be at the time of declaration only. 
          Not at any other places.
*/

			int[] i5 = {1, 2, 3, 4};		//This is the correct way
			 
			//i5 = {1, 2, 3 , 4};     		//Compile time error //Array constants can only be used in initializers
			 
			i5 = new int[]{1, 2, 3, 5};  	//This is also correct way

/*    
Rule 6) : Another way of declaring multi dimensional arrays.
*/
			
			int[][] twoDArray;    			//Normal way of declaring two-dimensional array
			                                 
			int[] TwoDArray [];   			//Another way of declaring two-dimensional array
			 
			int[][][] threeDArray;  		//Normal way of declaring three-dimensional array
			 
			int[] ThreeDArray [][];   	 	//This is also legal

/*    
Rule 7) : While creating multi dimensional arrays, you can not specify an array dimension after an empty dimension.
*/                                       
			
			//int[][][] threeDArray0 = new int[10][][10];	//Compile Time Error //Cannot specify an array dimension after an empty dimension
			 
			//int[][][] threeDArray1 = new int[][10][];		//Compile Time Error //Cannot specify an array dimension after an empty dimension
			 
			//int[][][] threeDArray2 = new int[][][10];		//Compile Time Error //Cannot specify an array dimension after an empty dimension
                                      
/*    
Rule 8) : You can create an anonymous array i.e an array without reference.
*/
			
			//Creating anonymous array
			                                         
			System.out.println(new int[]{1, 2, 3}.length);		//Output : 3
			 
			System.out.println(new int[]{47, 21, 58, 98}[1]);	//Output : 21
                                   
/*    
Rule 9) : While assigning one array reference variable to another, compiler checks only type of the array not the size.
*/
			
			int[] a = new int[10];
			                                         
			int[] b = new int[100];
			 
			double[] c = new double[20];
			 
			a = b;
			 
			//b = c;     //Compile Time Error : cannot convert from double[] to int[]
                                           
/*    
Rule 10) : The size of an array can not be changed once you define it. 
           You can not insert or delete array elements after creating an array. Only you can change is the value of the elements. 
           This is the main drawback of arrays
*/

                                        
                                  
    
    }
}


