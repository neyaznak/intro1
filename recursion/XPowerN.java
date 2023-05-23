package recursion;
import java.util.Scanner;

public class XPowerN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int ans = xPowerN(x, n);
		System.out.println(ans);
		
	}

	public static int xPowerN(int x, int n) {
		if(n == 0) {
			return 1;
		}
		
		int smallAns = x * xPowerN(x, n-1);
		return smallAns;
	}

}
