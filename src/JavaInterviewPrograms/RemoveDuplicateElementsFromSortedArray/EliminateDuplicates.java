package JavaInterviewPrograms.RemoveDuplicateElementsFromSortedArray;

public class EliminateDuplicates {

	public static void removeDuplicates(int[] input) 
	{
		for (int i = 0; i < input.length; i++) 
		{
			for (int j = i + 1; j < input.length; j++) 
			{
				if (input[i] == input[j]) 
				{
					input[i] = -1;
					//	OR
					//input[j] = -1;
				}
			}
		}

		for (int i = 0; i < input.length; i++) 
		{
			if (input[i] != -1) 
			{
				System.out.println(input[i]);
			}
		}

	}

	public static void main(String a[]) 
	{
		 //int[] input1 = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		//int[] input1 = { 1, 3, 7, 8, 8, 9, 14, 16, 16, 17, 17 };
		int[] input1 = { 2, 8, 9, 10, 10, 10};
		removeDuplicates(input1);
	}
}
