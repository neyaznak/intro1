package strings;

import java.util.Scanner;

public class RemoveCharacterXFromString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char X = s.next().charAt(0);
		removeCharacterXFromString(str, X);

	}

	public static void removeCharacterXFromString(String str, char X) {
		String updatedStr="";
		for(int i = 0; i <= str.length()-1; i++) {
			char currentChar=str.charAt(i);
			if(currentChar != X) {
				updatedStr += currentChar;
			}
		}
		System.out.print(updatedStr);
	}

}
