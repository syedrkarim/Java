package string;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome";
		String s1=" to Java";
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		
		s="    Welcome     ";
		System.out.println(s.trim());
		
		s="Welcome";
		System.out.println(s.charAt(3));
		
		s="Welcome";
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		s="Welcome";
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("Wel come"));
		System.out.println(s.equals("wel come"));
		
		System.out.println(s.equalsIgnoreCase("welcome"));
		
		s="Welcome to Java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("Java", "Selenium"));
		
		s="Welcome";
		System.out.println(s.substring(4, 7));
		
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		s="welcome";
		System.out.println(s.toUpperCase());
		

	}

}
