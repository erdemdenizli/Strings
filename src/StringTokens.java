import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.

		s = s.replaceAll("[',!_?.@]", " ");

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
				s = s.substring(0, i + 1) + s.substring(i + 2);
				i -= 1;
			}
		}

		s = s.trim();

		if (s.length() == 0 || s.length() == 40000) {
			System.out.println("0");
		} else {

			String[] arr = s.split(" ");
			System.out.println(arr.length);

			for (String each : arr) {
				System.out.println(each);
			}
		}

		scan.close();

	}

}
