package Strings_java;

public class FindLargestStringinSentence {

	public static void main(String[] args) {
		
		String s="i am an Automation test Engineer";
		String[] s1 = s.split(" ");
		System.out.println(s1.length);
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]+" "+s1[i].length());
		}
		
		int maxcount=0;
		String word="";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()>maxcount)
			{
				maxcount=s1[i].length();
				word=s1[i];
			}
		}
		System.out.println(word+" "+maxcount);
		
		}
}
