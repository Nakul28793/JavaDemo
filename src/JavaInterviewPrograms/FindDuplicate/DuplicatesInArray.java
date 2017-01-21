package JavaInterviewPrograms.FindDuplicate;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	
	public static void printDistinctElements(int[] arr)
	{   
		for(int i=0;i<arr.length;i++)
		{
            boolean isDistinct = false;
            for(int j=0;j<i;j++)
            {
                if(arr[i] == arr[j])
                {
                	isDistinct = true;
                    break;
                }
            }
            
            if(!isDistinct)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
     
	public static void printDistinctElementsUsingBruteForceMethod(int[] nums)
	{ 	
		Set set2=new HashSet();
		for (int i = 0; i < nums.length-1; i++)
		{
			for (int j = i+1; j < nums.length; j++)
			{
				if( (nums[i]==nums[j]) && (i != j) )
				{
					if(set2.contains(nums[i])==false)
					{
						set2.add(nums[i]);
						System.out.println("Duplicate Element is : "+nums[i]+" using Brute Force Method");
					}
				}
			}		
		}
	}	
	
	public static void printDistinctElementsUsingHashSet(int[] nums)
	{
		HashSet<Integer> set1 = new HashSet<Integer>();
		 
        /*for (Integer arrayElement : nums)
        {	
        	//If same integer is already present then add method will return FALSE
            if(set1.add(arrayElement)==false)
            {
            	System.out.println("Duplicate Element is : "+arrayElement);        	
            }
        }*/
        
        for(int i = 0; i < nums.length ; i++)
        {
            //If same integer is already present then add method will return FALSE
            if(set1.add(nums[i]) == false)
            {
                System.out.println("Duplicate element found : " + nums[i]);
            }
        }
	}
	
	public static void printDistinctElementsUsingBruteForceMethodForString(String[] strArray)
	{
		for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[i]+" using Brute Force Method");
                }
            }
        }
	}
	public static void printDistinctElementsUsingHashSetForString(String[] strArray)
	{
        HashSet<String> set = new HashSet<String>();
        
        for (String arrayElement : strArray)
        {
            //if(!set.add(arrayElement))
            if(set.add(arrayElement)==false)	
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
	}
//- See more at: http://www.java2novice.com/java-interview-programs/distinct-elements/#sthash.kTVzsWtU.dpuf
	
	public static void main(String[] args)
    {
		//int[] nums = {5,2,7,2,4,7,8,2,3};
		int[] nums = {1,1,2,3,4,5,6,7,8,8};
		
		DuplicatesInArray.printDistinctElements(nums);
		System.out.println("");
		System.out.println("");
		
		System.out.println("printDistinctElementsUsingBruteForceMethod");
		DuplicatesInArray.printDistinctElementsUsingBruteForceMethod(nums);
		System.out.println("");
		
		System.out.println("printDistinctElementsUsingHashSet");
		DuplicatesInArray.printDistinctElementsUsingHashSet(nums);
		System.out.println("");
		
		
		
		
		
	
 
		//String[] strArray = {"abc", "xyz", "mno", "xyz", "pqr", "xyz"};
		String[] strArray = { "Java", "JavaScript", "Java","Python", "C", "Ruby", "Java" };

		
		DuplicatesInArray.printDistinctElementsUsingBruteForceMethodForString(strArray);
		System.out.println("");
		
		DuplicatesInArray.printDistinctElementsUsingHashSetForString(strArray);
		System.out.println("");               
    }
}
