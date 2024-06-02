package string;

public class RemoveSpecialCharecterFromString {

	public static void main(String[] args) {
		String s = "*&^$ Selenium ^^% Java@#$";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s);
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
