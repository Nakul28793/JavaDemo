package OverrodingIssues;
/*
 * we can override synchronized method with non-synchronized vice-verse
 * Rule #11: The synchronized modifier has no effect on the rules of overriding.
 * Rule #12: The strictfp modifier has no effect on the rules of overriding.
 */
class Baseclass1
{
    public synchronized void sm()
    {
    	System.out.println("super class");
    }
}  

public class SyncOverriding extends Baseclass1
{
    public void sm()
    {    
        System.out.println("sub class");
    }
    
    public static void main(String a[])
    {    
        SyncOverriding s=new SyncOverriding();
        s.sm();      // sub class
        
        Baseclass1 b1=new Baseclass1();
        b1.sm(); //super class
        
        Baseclass1 bs=new SyncOverriding();
        bs.sm(); //sub class
        
        //SyncOverriding sy=new Baseclass1(); //Type mismatch: cannot convert from Baseclass1 to SyncOverriding
        //sy.sm();
        
        SyncOverriding syo=(SyncOverriding)new Baseclass1();
        syo.sm();
        /*
         * Exception in thread "main" java.lang.ClassCastException: OverrodingIssues.Baseclass1 cannot be cast to OverrodingIssues.SyncOverriding
					at OverrodingIssues.SyncOverriding.main(SyncOverriding.java:36)

         */
        
        
    }
}
