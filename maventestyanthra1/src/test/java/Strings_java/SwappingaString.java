package Strings_java;

public class SwappingaString {

	public static void main(String[] args) {
		
		String s="welcome to tyss hyderabad";
		String[] s1 = s.split(" ");
		String temp="";
		
		temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
			
			
		}
	}

}
