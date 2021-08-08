package firstDay;

public class Day21_StringManipulation {

	public static void main(String[] args) {
		String sentence = "Today is Tuesday and we are learning String manipulation";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word);
			char[] characters = word.toCharArray();
			for (char a : characters) {
				System.out.println(a);
			}
		}

	}

}
