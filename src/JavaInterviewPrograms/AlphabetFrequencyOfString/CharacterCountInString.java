package JavaInterviewPrograms.AlphabetFrequencyOfString;

public class CharacterCountInString {

	public static void main(String[] args) 
	{		
		String inputString = "This is it";
		System.out.println("inputString is : " + inputString);
		System.out.print("Output is : ");
		characterCount(inputString);
	}

	/**
	 * Method calculates count of all characters in inputString.
	 */
	public static void characterCount(String inputString) 
	{
		char[] inputAr = inputString.toCharArray();
		int count = 0, arLength;

		arLength = inputAr.length;
		for (int x = 0; x < arLength; x++) 
		{
			char ch = inputAr[x];
			for (int y = x + 1; y < arLength; y++)
			{
				if (inputAr[y] == ch) 
				{ 	
					// if we have find same character again in string
					for (int z = y; z < arLength - 1; z++) 
					{	
						// shift characters left.
						inputAr[z] = inputAr[z + 1];
					}	
					arLength--; 	// as characters have been reduce arLength.
					y = x; // done to tackle case if occurrence of character is more than once in string.
				}
			}
		}

		/*
		 * Till this point of program, inputAr's first arLength number of
		 * elements are unique.
		 */

		for (int x = 0; x < arLength; x++) 
		{
			count = 0;
			for (int y = 0; y < inputAr.length; y++) 
			{
				if (inputAr[x] == inputString.charAt(y))
				{	
					count++;
				}	
			}
			System.out.print(inputAr[x] + "=" + count + " ");
		}

	}

}