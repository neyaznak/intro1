package strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = new String();
		str = s.nextLine();
		removeConsecutiveDuplicates(str);
	}

	public static void removeConsecutiveDuplicates(String str) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= str.length()-1; i++) {
			char currentChar = str.charAt(i);
			if(sb.length() == 0 || currentChar != sb.charAt(sb.length()-1)) {
				sb.append(currentChar);
			}
		}
		System.out.println(sb);
		
	}

}
