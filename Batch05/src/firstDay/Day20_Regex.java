package firstDay;

public class Day20_Regex {

	public static void main(String[] args) {
		String mixCharacters = "H1r2E3e4L5g6L7u8O9l0WaOrReLxDp!@#$%r^e&s*s(io)n_-";
		String noNumbers = mixCharacters.replaceAll("[0-9]", "");
		System.out.println("Complete String : "+mixCharacters);
		System.out.println("Removed numbers from the string : "+noNumbers);
		String noNumbersLowerCase = noNumbers.replaceAll("[a-z]", "");
		System.out.println("This string will not have numbers and lower case values "+noNumbersLowerCase);
		System.out.println("This string will remove upper case characters from mix character variable : "+mixCharacters.replaceAll("[A-Z]", ""));
		System.out.println("Remove numbers/lowecase/uppercase "+mixCharacters.replaceAll("[A-Za-z0-9]", ""));
		
		String removeSpecialCharacter = mixCharacters.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("This will not show special character "+removeSpecialCharacter);
		System.out.println("This will only print lower case characters "+mixCharacters.replaceAll("[^a-z]", ""));
		System.out.println("This will only print upper case characters "+mixCharacters.replaceAll("[^A-Z]", ""));
		System.out.println("This will only print numbers "+mixCharacters.replaceAll("[^0-9]", ""));
		
		// convert String to character of array
		char[] values = removeSpecialCharacter.toCharArray();
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
	
		for(char value : values) {
			System.out.println("using advance loop " +value);
		}
	}

}
