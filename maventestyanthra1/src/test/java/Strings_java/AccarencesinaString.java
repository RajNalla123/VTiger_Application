package Strings_java;

public class AccarencesinaString {

	public static void main(String[] args) {
		
		String s="aaaabbbcccda";
		char[] ch=s.toCharArray();
		for(char c='a';c<='z';c++)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(c==ch[i])
				{
					count++;
					
				}
			}
			if(count>0)
			{
				System.out.println(c+""+count);
			}
}
}
}