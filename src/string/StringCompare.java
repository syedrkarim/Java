package string;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String str1 = new String("selenium");
		String str2 = new String("selenium");
		String str3 = new String("java");
		System.out.println(str1 == str2); // Compare the object.
		System.out.println(str1.equals(str2)); // Compare the content/value of the object.
		System.out.println(s1 == str3);
		System.out.println(s1.equals(str3));

	}

}
