package Strings_java;

public class ReverseStringsentence2 {

	public static void main(String[] args) {
		
		String s="djtillu is a movie";
		String[] str = s.split(" ");
		
		
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			String rev="";
			for(int j=0;j<str1.length();j++)
			{
				rev=str1.charAt(j)+rev;
			}
			System.out.print(rev+" ");
		}
			
		}
	}


