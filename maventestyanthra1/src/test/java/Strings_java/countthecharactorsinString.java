package Strings_java;

public class countthecharactorsinString {

	public static void main(String[] args) {
		
		String s="djtillu";
		String rev="";
		char[] charr = s.toCharArray();
		int count=0;
		for(char ch:charr)
		{
			count++;
		}
		System.out.println(count);
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
