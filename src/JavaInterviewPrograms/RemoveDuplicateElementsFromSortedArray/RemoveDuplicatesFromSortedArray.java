package JavaInterviewPrograms.RemoveDuplicateElementsFromSortedArray;
/*
 * http://www.javamadesoeasy.com/2015/02/remove-duplicate-elements-from-sorted.html
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static int[] removeDuplicates(int[] input) {

		
		int i = 0;
		int j = 1;
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (j < input.length) {
			if (input[j] == input[i]) {
				j++;
			} else {
				++i; //i++
				input[i] = input[j];
				j++;
			}
		}
		
		int[] output = new int[i+1]; 
		for(int k=0; k<output.length; k++){
			output[k] = input[k]; 
		}
		 
		// OR
		//int[] output = Arrays.copyOf(input, i + 1);

		return output;
	}
	
	public static int[] removeDuplicates1(int[] arr) {
	    Set<Integer> alreadyPresent = new HashSet<Integer>();
	    int[] whitelist = new int[arr.length];
	    int i = 0;

	    for (int element : arr) {
	        if (alreadyPresent.add(element)) {
	            whitelist[i++] = element;
	        }
	    }

	    return Arrays.copyOf(whitelist, i);
	}

	public static void main(String a[]) {
		//int[] input1 = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		int[] input1 = { 1, 3, 7, 8, 8, 9, 14, 16, 16, 17, 17, 17};
		int[] output = removeDuplicates(input1);
		System.out.println(output.length);
		for (int i : output) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int[] sizeofarray = removeDuplicates1(input1);
		System.out.println(sizeofarray.length);
		
	}
}
// - See more at:
// http://java2novice.com/java-interview-programs/remove-duplicates-sorted-array/#sthash.O0ZJGVLT.dpuf
