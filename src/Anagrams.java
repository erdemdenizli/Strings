import java.util.Scanner;
import java.util.*;

public class Anagrams {

	public static boolean isAnagram(String word1, String word2) {

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		
		//sten
		//sent

		while (0 < word1.length()) {
			int i = 0;
			if (word1.length() != word2.length()) {
				return false;
			} else if (word2.contains("" + word1.charAt(i))) {
				word2 = word2.replaceAll("" + word1.charAt(i), "");
				word1 = word1.replaceAll("" + word1.charAt(i), "");
			} else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}