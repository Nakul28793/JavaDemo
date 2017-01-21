package Sorting;

public class MyBinarySearch {

	public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (key < inputArr[mid]) 
            {
                end = mid - 1;
            } 
            else if(key > inputArr[mid]) 
            {
                start = mid + 1;
            }
            else
            {
            	return mid;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
        
        int[] arr3 = {2,3,4,5,6,8,7,8,16};
        System.out.println("Key 2's position: "+mbs.binarySearch(arr3, 2));
        
    }
}
//- See more at: http://java2novice.com/java-search-algorithms/binary-search/#sthash.8ZFBTcZK.dpuf