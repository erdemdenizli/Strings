import java.util.Scanner;

public class SplitASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

//		String[] arrOfStr = sentence.split(" ");
//		for (String a : arrOfStr) System.out.println(a);

//********************************

//		for (int i = 0; i < sentence.length(); i++) {
//
//			if (sentence.charAt(i) == ' ') {
//				System.out.println(sentence.substring(0, i));
//				sentence = sentence.substring(i + 1);
//				i = 0;
//			} else if (!sentence.contains(" ")) {
//				System.out.print(sentence);
//				break;
//			}
//		}

//********************************		

		for (;sentence.length() > 0;) {
			if (sentence.contains(" ")) {
				System.out.println(sentence.substring(0, sentence.indexOf(" ")));
				sentence = sentence.substring(sentence.indexOf(" ") + 1);
			} else {
				System.out.println(sentence);
				break;
			}

		}

	}

}
