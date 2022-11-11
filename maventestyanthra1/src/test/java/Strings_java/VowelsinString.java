package Strings_java;

public class VowelsinString {

	public static void main(String[] args) {
		
		String s="Testyantra";
		int count=0;
		char[] str = s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.println(ch);
			}
		}
		  System.out.println("vowels count is"+count);

	}

}
