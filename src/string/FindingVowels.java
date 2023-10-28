package string;

public class FindingVowels {

	public static void main(String[] args) {

		String str = "Welcome to Java World";
		str = str.toLowerCase();
		System.out.println(str);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.println("Vowel is: " + str.charAt(i) + " Position is: " + i);
				count++;
			}
		}
		System.out.println("Total Vowels: " + count);

	}

}
