package searching_sorting;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int [] arr = {2,44,5,67,8};
		int ans =linearSearch(arr, x);
		if(ans != -1) {
			System.out.println("Element found at index "+ans);
		}
		else {
			System.out.println("Element not found");
		}
		
	}

	public static int linearSearch(int[] arr, int x) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}else {
				continue;
			}
		}	
		return -1;
	}
}
