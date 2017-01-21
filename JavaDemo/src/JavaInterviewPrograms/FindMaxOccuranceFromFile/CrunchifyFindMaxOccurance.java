package JavaInterviewPrograms.FindMaxOccuranceFromFile;
/*
 * http://www.programcreek.com/2011/03/java-read-a-file-line-by-line-code-example/
 */
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
 
public class CrunchifyFindMaxOccurance {
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		//File file = new File("/Users/<username>/Documents/test.txt");
		File file = new File("E:/ARPIT/D/OFFICE/MARS_WORKSPACE/JavaDemo/src/JavaInterviewPrograms/MyTestFile.txt");
		BufferedReader bufferedReader = null;
		// FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(file);
		// Always wrap FileReader in BufferedReader.
		bufferedReader = new BufferedReader(fileReader);
		String inputLine = null;
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
 
		try 
		{
			while ((inputLine = bufferedReader.readLine()) != null) 
			{
				String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");
 
				for (int counter = 0; counter < words.length; counter++) 
				{
					String key = words[counter].toLowerCase(); // remove .toLowerCase for Case Sensitive result.
					if (key.length() > 0) 
					{
						if (wordMap.get(key) == null) 
						{
							wordMap.put(key, 1);
						} 
						else 
						{
							int value = wordMap.get(key).intValue();
							value++;
							wordMap.put(key, value);
						}
					}
				}
			}
			
			Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();
			
			System.out.println("Words" + "\t\t" + "# of Occurances");
			
			for (Map.Entry<String, Integer> entry : entrySet)
			{
				System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			}
			
			List<String> myTopOccurrence = findMaxOccurance(wordMap, 1);
			
			System.out.println("\nMaixmum Occurance of Word in file: ");
			
			for (String result : myTopOccurrence) 
			{
				System.out.println("==> " + result);
			}
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
				if (bufferedReader != null)bufferedReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
 
	//How many top elements you want to print? If n=1 it will print highest occurrence word. 
	//If n=2 it will print top 2 highest occurrence words
	public static List<String> findMaxOccurance(Map<String, Integer> map, int n) 
	{
		List<FileData> l = new ArrayList<FileData>();
		for (Map.Entry<String, Integer> entry : map.entrySet())
		{	
			l.add(new FileData(entry.getKey(), entry.getValue()));
		}	
 
		Collections.sort(l);
		
		List<String> list = new ArrayList<String>();
		//for (FileData w : l.subList(0, n))
		for (FileData w : l)
			list.add(w.wordFromFile + " ==== " + w.numberOfOccurrence);
		return list;
	}
}
 
class FileData implements Comparable<FileData> {
	public String wordFromFile;
	public int numberOfOccurrence;
 
	public FileData(String wordFromFile, int numberOfOccurrence) {
		super();
		this.wordFromFile = wordFromFile;
		this.numberOfOccurrence = numberOfOccurrence;
	}
 
	@Override
	public int compareTo(FileData arg0) {
		//int crunchifyCompare = Integer.compare(arg0.s, this.numberOfOccurrence);
	    //return crunchifyCompare != 0 ? crunchifyCompare : wordFromFile.compareTo(arg0.wordFromFile);
		int flag = ((arg0.numberOfOccurrence < this.numberOfOccurrence) ? -1 : (arg0.numberOfOccurrence > this.numberOfOccurrence) ? 1 : 0);
		if (flag == 0) 
		{
			flag= this.wordFromFile.compareTo(arg0.wordFromFile);
		}
		return flag;	 
	}
 
	/*@Override
	public int hashCode() {
		final int uniqueNumber = 19;
		int crunchifyResult = 9;
		crunchifyResult = uniqueNumber * crunchifyResult + numberOfOccurrence;
		crunchifyResult = uniqueNumber * crunchifyResult + ((wordFromFile == null) ? 0 : wordFromFile.hashCode());
		return crunchifyResult;
	}
 
	@Override
	public boolean equals(Object crunchifyObj) {
		if (this == crunchifyObj)
			return true;
		if (crunchifyObj == null)
			return false;
		if (getClass() != crunchifyObj.getClass())
			return false;
		CrunchifyComparable other = (CrunchifyComparable) crunchifyObj;
		if (numberOfOccurrence != other.numberOfOccurrence)
			return false;
		if (wordFromFile == null) {
			if (other.wordFromFile != null)
				return false;
		} else if (!wordFromFile.equals(other.wordFromFile))
			return false;
		return true;
	}*/
}
