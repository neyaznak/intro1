package recursion;
import java.util.Scanner;

public class NumberOfDigits {
	static int counter = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = count(n);
		System.out.println(ans);
	}

	public static int count(int n) {
		counter++;
		if(n <= 9) {
			return 1;
		}
		count(n/10);
		return counter;	
	}

}
