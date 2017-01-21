package JavaInterviewPrograms.FindMaxOccuranceFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {
	public static void main(String args[])  throws FileNotFoundException, IOException
	{
		
			File file = new File("E:/ARPIT/D/OFFICE/MARS_WORKSPACE/JavaDemo/src/JavaInterviewPrograms/MyTestFile.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=null;
			br=new BufferedReader(fr);
			Map<String,Integer> hm = new HashMap<String,Integer>();
			String line=null;
		try
		{
			while((line=br.readLine())!=null)
			{
				String[] words=line.split(" ");
				for(int i=0;i<words.length;i++)
				{
					String key=words[i];
					if(key.length()>0)
					{
						if(hm.get(key)==null)
						{
							hm.put(key,1);
						}
						else
						{
							hm.put(key, hm.get(key)+1);
						}
					}
				}	
			}
			
			Set<Map.Entry<String,Integer>> s=hm.entrySet();
			for(Map.Entry<String,Integer> entry : s)
			{
				System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			}
			
			max(hm,1);
		}
		catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + file + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + file + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		finally 
		{	// Always close files.
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void max(Map<String,Integer> entry1,int n)
	{
		List<FileData> l=new ArrayList<FileData>();
		for(Map.Entry<String,Integer> entry : entry1.entrySet())
		{
			l.add(new FileData(entry.getKey(), entry.getValue()));
		}
		Collections.sort(l);
	}
}


class FileData implements Comparable<FileData>
{
	private int noOfOccurance;
	private String wordsFromFile;
	FileData(String wordsFromFile,int noOfOccurance)
	{
		this.noOfOccurance=noOfOccurance;
		this.wordsFromFile=wordsFromFile;
	}

	public int compareTo(FileData arg)
	{ 					
		int flag=arg.noOfOccurance<this.noOfOccurance ? -1 : arg.noOfOccurance>this.noOfOccurance ? 1: 0;  
		if(flag==0)
		{
			flag = this.wordsFromFile.compareTo(arg.wordsFromFile);
		}
		return flag;
	}

}
