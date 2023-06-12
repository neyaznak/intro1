package recursion;

import java.util.Scanner;

public class MultiplyRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int ans = multiply(m, n);
		System.out.println(ans);

	}

	public static int multiply(int m, int n) {
		
		if(n == 0) {
			return 0;
		}

		int smallAns = m + multiply(m, n-1);
		return smallAns;
	}
}
