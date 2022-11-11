package Strings_java;

import java.util.Arrays;

public class SwappingAlternateINString {

	public static void main(String[] args) {
		
		String s="z%#d#b%#a";
		 char[] ch = s.toCharArray();
		 
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='z')
			 {
				 char temp=ch[i];
				 ch[i]=ch[ch.length-1];
				 ch[ch.length-1]=temp;
			 }
			 
			 if(ch[i]=='d')
			 {
				char temp1=ch[i];
				ch[i]=ch[ch.length-4];
				ch[ch.length-4]=temp1;
			 }
			 System.out.println(Arrays.toString(ch));
			 
			 
		 }
		 

	}

}

