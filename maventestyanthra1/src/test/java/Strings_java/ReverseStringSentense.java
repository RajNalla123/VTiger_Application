package Strings_java;

public class ReverseStringSentense {

	public static void main(String[] args) {
		
		String s= "djtillu is a hero";
		String[] str = s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			rev=str[i]+" "+rev;
		}
		System.out.println(rev);

	}

}
