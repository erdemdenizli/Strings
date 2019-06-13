import java.util.*;

public class ReverseASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String sentence = scan.nextLine();
		
		String reversed = "";

		int length = sentence.length();
		for (int i = length - 1; i >= 0; i--) {
			if (sentence.charAt(i) == ' ') {
				reversed += (sentence.substring(i + 1) + " ");
				sentence = sentence.substring(0, i);
			} else if(i==0) {
				reversed += sentence.substring(i);
			}
		}
		
		System.out.println(reversed);
	}

}
