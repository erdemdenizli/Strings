import java.util.Scanner;
import java.util.*;

public class AnagramsbyArray {

	static boolean isAnagram(String a, String b) {

		String[] a1 = a.split("");
		String[] b1 = b.split("");
//		char[] a1 = a.toCharArray();
//		char[] b1 = b.toCharArray();
		if (a1.length != b1.length)
			return false;
		Arrays.sort(a1);
		Arrays.sort(b1);
		return (Arrays.equals(a1, b1));
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