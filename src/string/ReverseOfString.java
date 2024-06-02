package string;

public class ReverseOfString {

	public static void main(String[] args) {
		String str = "Madam";
		String revStr = "";
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		/*char[] arr = str.toCharArray();

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			revStr = revStr + arr[i];
		}
		*/
		System.out.println(revStr);
		
		if (str.equalsIgnoreCase(revStr))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
