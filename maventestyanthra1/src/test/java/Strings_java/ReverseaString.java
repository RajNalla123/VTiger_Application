package Strings_java;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="djtillu";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);

	}

}
