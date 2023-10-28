package string;

public class CharAtOddPossition {

	public static void main(String[] args) {
		
		String str="Welcome to java";
		for(int i=0; i<str.length()-1; i++) {
			if(i%2!=0)
				System.out.println("position "+i+" charecter is "+str.charAt(i));
		}

	}

}
