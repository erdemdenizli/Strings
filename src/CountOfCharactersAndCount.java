import java.util.ArrayList;
import java.util.Arrays;

public class CountOfCharactersAndCount {

	public static void main(String[] args) {

		String str = "AAAABCCCD";
		//String str = "AAABBCCA";
		

		ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
		ArrayList<Integer> list2 = new ArrayList<>();

		String newStr = "";
		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {

					count++;

					list.remove(j);

					j--;

				} else {
					break;
				}
			}
			newStr += list.get(i);
			list2.add(count + 1);
			count = 0;
		}

		String newNewStr = "";

		for (int i = 0; i < newStr.length(); i++) {
			newNewStr += list2.get(i) + "" + newStr.charAt(i);
		}

		System.out.println(newNewStr);

	}

}
