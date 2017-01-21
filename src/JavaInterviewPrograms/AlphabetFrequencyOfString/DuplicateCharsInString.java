package JavaInterviewPrograms.AlphabetFrequencyOfString;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	 
    public void findDuplicateChars(String str){
    	//Create a HashMap 
        //Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        Map<Character, Integer> dupMap = new LinkedHashMap<Character, Integer>();
        //Convert the String to char array
        char[] chrs = str.toCharArray();
        /* logic: char are inserted as keys and their count
         * as values. If map contains the char already then
         * increase the value by 1
         */
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        //Obtaining set of keys
        Set<Character> keys = dupMap.keySet();
        /* Display count of chars if it is
         * greater than 1. All duplicate chars would be 
         * having value greater than 1.
         */
        for(Character ch:keys){
            //if(dupMap.get(ch) > 1){
                System.out.println("Char "+ch+"--->"+dupMap.get(ch));
            //}  
         }
        for(Character ch:keys){
            if(dupMap.get(ch) == 1){
                System.out.println("Char "+ch+"--->"+dupMap.get(ch));
                break;
            }  
         }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        //dcs.findDuplicateChars("Java2Novice");
        System.out.println("String: BeginnersBook.com");
        System.out.println("-------------------------");
        dcs.findDuplicateChars("BeginnersBook.com");
      
        //System.out.println("\nString: ChaitanyaSingh");
        System.out.println("\nString: Arpit");
        System.out.println("-------------------------");
        //dcs.findDuplicateChars("ChaitanyaSingh");
        dcs.findDuplicateChars("Arpit");
     
        System.out.println("\nString: #@$@!#$%!!%@");
        System.out.println("-------------------------");
        dcs.findDuplicateChars("#@$@!#$%!!%@");
    }
}
//- See more at: http://www.java2novice.com/java-interview-programs/duplicate-string-character-count/#sthash.4KDOWZde.dpuf