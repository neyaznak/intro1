package strings;
import java.util.Scanner;
public class CheckPalindrome {	
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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = reverseString(str);
		checkPalindrome(str1, str);
	}
	public static String checkPalindrome(String str1, String str) {
		for(int i = 0; i < str.length(); i++) {
		if(str1.charAt(i)==str.charAt(i)) {
			continue;
		}
		}
		return "true";
	}
}
