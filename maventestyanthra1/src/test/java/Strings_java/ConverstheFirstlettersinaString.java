package Strings_java;

public class ConverstheFirstlettersinaString {

	public static void main(String[] args) {
		
		String s="welcome to hyderabad";
		String[] str = s.split(" ");
		for(String w:str)
		{
			String uppercaseletters = w.substring(0, 1).toUpperCase();
			String remainingletters = w.substring(1);
			System.out.print(uppercaseletters+""+remainingletters+" ");
		}

	}

	
}
