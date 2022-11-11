package Strings_java;

public class Swappingallcharactors {

	public static void main(String[] args) {
		
		String s="a*#b8%d#z";    //we want o/p : z#d%*b#*a
		char[] ch = s.toCharArray();
		int left=0;
		int right=ch.length-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[left]>='a' && ch[left]<='z')
			{
				if(ch[right]>='a' && ch[right]<='z')
				{
				if(left<right)
				{
					char temp=ch[left];
					ch[left]=ch[right];
					ch[right]=temp;
					left++;
					right--;
				}
				}
				else
				{
					right--;
				}
				
			}
			else
			{
				left++;
			}
			
		}
		System.out.println(ch);
		

	}

	
}
