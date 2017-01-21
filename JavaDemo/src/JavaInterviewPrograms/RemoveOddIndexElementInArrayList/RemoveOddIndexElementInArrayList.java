package JavaInterviewPrograms.RemoveOddIndexElementInArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddIndexElementInArrayList
{
	public static void main(String[] args)
	{	
		/*int[] a ={1,2,3,4,5,6,7,8,9,10};
		
		List l = new ArrayList(Arrays.asList(a));*/
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(11); //0 index
		l.add(22); //1 index
		l.add(33); //2 index
		l.add(44); //3 index
		l.add(55); //4 index
		l.add(66); //5 index
		
		for(int i=l.size()-1;i>=0;i--)
		{
			if(i%2!=0) //Modulus(%) returns remainder
			{
				System.out.println(i+" index is going to remove "+ l.get(i)+" current size "+l.size());
				l.remove(i);
			}	
		}
		System.out.println("");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
	
}
