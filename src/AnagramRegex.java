
public class AnagramRegex {

	public static boolean isAnagram(String word1, String word2) {
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		if (word1.length() != word2.length())
			return false;

		word2 = word2.replaceAll("[" + word1 + "]", "");
		return word2.isEmpty();
		
		//return (word1.length()!=word2.length()) ? false: word2.toLowerCase().replaceAll("["+word1.toLowerCase()+"]","").isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
