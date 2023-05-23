package recursion;

import java.util.Scanner;

public class CheckNumberInArray {
	public static boolean checkNumberInArray(int[] input, int x) {
		if(input.length == 0) {
			return false;
		}
		
		if(input[0] == x) {
			return true;
		}
		
		int[] tempInput = new int[input.length-1];
		for(int i = 1; i < input.length; i++) {
			tempInput[i-1] = input[i];
		}
		boolean smallAns = checkNumberInArray(tempInput, x);
		
		return smallAns;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int[] input = {2,3,4,7,-8,0,9};
		System.out.println(checkNumberInArray(input,x));

	}

	
}
