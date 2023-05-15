package strings;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printAllSubstrings(str);

	}

	public static void printAllSubstrings(String str) {
		for(int i = 0; i <= str.length()-1; i++) {
			for(int j = i; j<= str.length(); j++) {
				System.out.print(str.substring(i, j)+" ");
			}
		}
		
	}

}
