package Strings_java;

public class VowelsinStringsentense {

	public static void main(String[] args) {
		
		String[] s= {"sravan","tharun","raju"};
		
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			int vowelcount=0;
			for(int j=0;j<str.length();j++)
			{
				char ch = str.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowelcount++;
				}
			}
			System.out.println(str+" "+vowelcount);
		}
		

	}

}
