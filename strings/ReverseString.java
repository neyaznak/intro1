package strings;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1=reverseString(str);
		System.out.print(str1);
	}

	public static String reverseString(String str) {
		if(str.length() == 0) {
			return null;
		}
		String ans="";
		for(int i = str.length()-1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		return ans;
	}
}
