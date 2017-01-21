package JavaInterviewPrograms;

public class CountUniqueElements {
	public static int countUnique(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] == input[i + 1]) {
				count++;
			}
		}
		return (input.length - count);
	}
	
	public static void main(String a[]) {
		int[] arr = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		int size = countUnique(arr);
		System.out.println(size);
		
		
	}
}
