package JavaInterviewPrograms.PrintArrayPairs;

import java.util.Arrays;

/*
 * Java Program to find all pairs on integer array whose sum is equal to k *
 */
public class PrintArrayPairsUsingTwoPointers {
	public static void main(String args[]) {
		//prettyPrint(new int[] { 12, 14, 17, 15, 19, 20, -11 }, 9);
		//prettyPrint(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);
		prettyPrint(new int[] { 1, 1, 2, 3 }, 4);
		prettyPrint(new int[] { 10, 6, 6, 6 }, 16);
		prettyPrint(new int[] { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 }, 7);
		

		 
	}

	/*
	 * Given a number finds two numbers from an array so that the sum is equal to that number k. 
	 * @param numbers
	 * @param k
	 *  complexity of this solution is O(nlogn)
	 */
	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) 
		{
			int sum = numbers[left] + numbers[right];
			if (sum == k) 
			{ // we have found one pair, add it to our output array
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} 
			else if (sum < k) 
			{// if the sum of the pair is less than the sum we are searching
	            // then increment the start pointer which would give us the sum
	            // more than our current sum as the array is sorted
				left = left + 1;
			} 
			else if (sum > k) 
			{// if the sum of the pair is greater than the sum we are searching
	            // then decrement the end pointer which would give us the sum
	            // less than our current sum as the array is sorted
				right = right - 1;
			}
		}
	}

	/* Utility method to print two elements in an array that sum to k. */ 
	public static void prettyPrint(int[] random, int k)
	{ 
		System.out.println("input int array : " + Arrays.toString(random)); 
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k); 
		printPairsUsingTwoPointers(random, k); 
	}
}

//Read more:http:// javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz3jQSUQUsr