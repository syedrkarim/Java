package string;

public class CharecterFrequency {

	public static void main(String[] args) {

		System.out.println(getFrequencyOfCharecter("welcome to world of java", 'o'));
	}

	public static int getFrequencyOfCharecter(String s, char c) {
		char[] a = s.toCharArray();
		int count = 0;
		for (char x : a) {
			if (x == c)
				count++;
		}
		return count;
	}

}
