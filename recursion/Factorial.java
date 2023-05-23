package recursion;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = fact(n);
		System.out.println(ans);
	}

	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		
		int smallAns = fact(n-1);
		return n * smallAns;
	}
	
}
