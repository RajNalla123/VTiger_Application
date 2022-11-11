package Strings_java;

public class RemovetheDuplicatesinString {

	public static void main(String[] args) {
		
		String s="aabbcca";
		char[] ch = s.toCharArray();
		String s2="";
		for(int i=0;i<ch.length;i++)
		{
			if(s2.indexOf(ch[i])==-1)
			{
				s2=s2+ch[i];
					
				}
			}
		System.out.println(s2);
		}

	}


