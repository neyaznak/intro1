package recursion;
import java.util.Scanner;

public class LastIndexOfNumberInArray {
	
	public static int lastIndexOfNumberInArray(int x, int[] input, int lastInd) {
		if(lastInd < 0) {
			return -1;
		}
		
		if(lastInd == 0) {
			if(input[lastInd] == x) {
				return lastInd;
			}
		}
		
		if(input[lastInd] == x) {
			return lastInd;
		}
		
		int smallAns = lastIndexOfNumberInArray(x, input, lastInd-1);
		
		return smallAns;
	}
	
    public static int lastIndexOfNumberInArray(int x, int[] input) {
		int ans = lastIndexOfNumberInArray(x, input, input.length-1);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int[] input = {2,7,4,1,0,8,9,87,87,34,22,22};
		int ans = lastIndexOfNumberInArray(x, input);
		System.out.println(ans);
	}

}
