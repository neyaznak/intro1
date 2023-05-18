package searching_sorting;
import java.util.Scanner;

public class BinarySearch {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size]; 
		for(int i = 0; i< input.length; i++) {
			input[i]=s.nextInt();
		}
		return input;
	}

	public static int binarySearch(int[] arr,int x) {
		int start = 0, end = arr.length-1, mid = (start+end)/2;
		while(start <= end) {
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				start = mid + 1;
				mid = (start + end) / 2;
			}else {
				end = mid - 1;
				mid = (start + end) / 2;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = takeInput();
		int x = s.nextInt();
		int ans = binarySearch(arr, x);	
		System.out.println(ans);
	}
}
