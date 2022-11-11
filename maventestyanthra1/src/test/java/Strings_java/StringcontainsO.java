package Strings_java;

public class StringcontainsO {

	public static void main(String[] args) {
		
		String s="Hello who are you";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			boolean word = str1.contains("o");
			if(word==true)
			{
				System.out.println(str1);
			}
		}

	}

}
