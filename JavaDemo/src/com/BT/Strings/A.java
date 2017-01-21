package com.BT.Strings;
/*
 * 	2 	OK. Compiles Fine ! 		
	3 	The IOException can be changed to InterruptedException 	
 */
abstract interface Veloz { void metodo(String x); }

public class A {

    private abstract interface Veloz
    { 
    	Number metodo(int x); 
    }  // 0

    abstract static class B
    {  // 1

		private abstract static interface Veloz
		{
			void metodo(long x) throws Exception;
		}

		public void metodo()
		{
			class Opa implements Veloz
			{
				public void metodo(long x) throws IOException 
				{	
					
				}   // 2
			}
		}
	}

    public void test()
    {
		class Opa2 implements Veloz
		{
			public Integer metodo(int x) throws RuntimeException 
			{ // 3

				return (Integer)(int) .5f;  //4
			}
		}
	}
}
