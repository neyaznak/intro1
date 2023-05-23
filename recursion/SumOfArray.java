package recursion;

public class SumOfArray {
    public static int sumOfArray(int[] input) {
		
    	if(input.length == 1) {
    		return input[0];
    	}
    	
    	int[] tempInput = new int [input.length-1];
    	for(int i = 1; i < input.length; i++) {
    		tempInput[i-1] = input[i];
    	}
    	int smallAns = input[0] + sumOfArray(tempInput);
    	return smallAns;
	}

	public static void main(String[] args) {
		int[] input = {2, 3, 6, 7, -3};
		int ans = sumOfArray(input);
		System.out.println(ans);

	}
	
}
