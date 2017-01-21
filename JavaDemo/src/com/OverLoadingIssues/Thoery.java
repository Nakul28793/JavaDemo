package com.OverLoadingIssues;

public class Thoery {
/*	How to NOT overload methods:

		1.  Just changing the return type of the method.  
		If the return type of the method is the only thing 
		changed, then this will result in a compiler error.  

		2.  Changing just the name of the method parameters, but 
		not changing the parameter types.  If the name of the 
		method parameter is the only thing changed then this 
		will also result in a compiler error.
		
		3. it is clear that compiler will check only method signature for method overloading or for duplicate methods. 
		It does not check return types, access modifiers and static or non-static.
  
		
		//compiler error - can't overload based on the   
		//type returned -
		//(one method returns int, the other returns a float):    

		int changeDate(int Year) ;  
		float changeDate (int Year);    

		//compiler error - can't overload by changing just 
		//the name of the parameter (from Year to Month):    

		int changeDate(int Year);   
		int changeDate(int Month) ;  
		 
		//valid case of overloading, since the methods
		//have different number of parameters:        

		int changeDate(int Year, int Month) ;  
		int changeDate(int Year);    

		//also a valid case of overloading, since the   
		//parameters are of different types:    

		int changeDate(float Year) ;  
		int changeDate(int Year);  
		
*/		
}
