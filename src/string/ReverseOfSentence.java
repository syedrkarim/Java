package string;

import java.util.Scanner;

public class ReverseOfSentence {
	
	public static String reverseSentence(String str) {
		String [] word=str.split(" ");
		String result="";
		for (int i=word.length-1; i>=0; i--) {
			if(i==0) {
				result= result+word[i];
			}
			else {
				result= result+word[i]+" ";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence:");
		String str=sc.nextLine();
		System.out.println(reverseSentence(str));
		sc.close();

	}

}
