package Strings_java;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="madam";
		char[] charr = s.toCharArray();
		String rev="";
		for(int i=0;i<charr.length;i++)
		{
			rev=charr[i]+rev;
		}
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
