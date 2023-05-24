package recursion;
import java.util.Scanner;

public class FirstIndexOfNumberInArray {
	static int counter = 0;
	
	public static int firstIndexOfNumberInArray(int x, int[] input) {
		
		if(input.length == 0) {
			return -1;
		}
		
		if(input[0] == x) {
			return counter;
		}
		counter++;
		
		int[] tempInput = new int[input.length-1];
		for(int i = 1; i < input.length; i++) {
			tempInput[i - 1] = input[i];
		}
		
		int smallAns = firstIndexOfNumberInArray(x, tempInput);
		return smallAns;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int[] input = {2,3,5,1,0,8,9,44};
		int ans = firstIndexOfNumberInArray(x, input);
		System.out.println(ans);
	}
}
