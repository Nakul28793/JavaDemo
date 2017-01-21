package JavaInterviewPrograms.RemoveOddIndexElementInArrayList;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		List<String> l= new ArrayList<String>();
		l.add("10");
		l.add("15");
		l.add("9");
		l.add("6");
		l.add("12");
		l.add("20");
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		for(int i=l.size()-1;i>=0;i--)
		{
			if(i%2!=0)
			{
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
