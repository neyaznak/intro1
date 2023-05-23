package recursion;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = sumOfNaturalNumbers(n);
		System.out.println(ans);
	}

	public static int sumOfNaturalNumbers(int n) {
		if(n == 1) {
			return 1;
		}
		int smallAns = sumOfNaturalNumbers(n-1);
		return n + smallAns;
	}

}
