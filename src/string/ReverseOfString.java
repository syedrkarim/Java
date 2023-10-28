package string;

public class ReverseOfString {

	public static void main(String[] args) {
		String str = "Madam";
		char[] arr = str.toCharArray();
		String revStr = "";

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			revStr = revStr + arr[i];
		}
		System.out.println(revStr);

		if (str.equalsIgnoreCase(revStr))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
