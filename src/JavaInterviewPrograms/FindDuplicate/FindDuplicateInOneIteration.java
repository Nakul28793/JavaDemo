package JavaInterviewPrograms.FindDuplicate;

public class FindDuplicateInOneIteration {
	
	//static int ar[] = { 3, 7, 3, 5, 8, 9, 24, 8, 9, 3 }; // given array
	static int ar[] = {1,1,2,3,4,5,6,7,8,8};

	public static void main(String[] args) 
	{
		System.out.print("array : ");
		for (int j = 0; j < ar.length; j++)
		{	
			System.out.print(ar[j] + " "); // display it
		}
		displayDuplicateInOneIteration();
	}

	/*
	 * Method for displaying duplicate in one iteration
	 */
	static public void displayDuplicateInOneIteration() {

		int tempAr[] = new int[100];
		System.out.print("\nduplicates :  ");
		for (int j = 0; j < ar.length; j++) 
		{ 
/*
 * make indexes of tempAr corresponding to value found in ar equal to 1. i.e 
 * if i[0]=22, than make tempAr[22]=1; 
 * if i[1]=25, than make tempAr[25]=1;
 */
			if (tempAr[ar[j]] == 0) 
			{
				tempAr[ar[j]] = 1;
			} 
			else 
			{
				System.out.print(ar[j] + " ");
			}
		}
	}

}