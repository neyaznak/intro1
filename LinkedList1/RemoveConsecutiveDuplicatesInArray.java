package linkedList1;
import java.util.ArrayList;

public class RemoveConsecutiveDuplicatesInArray {
	
public static ArrayList<Integer> removeConsecutiveDuplicatesInArray(int[] arr) {
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		int arr[] = {2,2,3,4,6,6,6,7,8,0,9,9,0,2,3};
		ArrayList<Integer> result = removeConsecutiveDuplicatesInArray(arr);
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}
	}

}
