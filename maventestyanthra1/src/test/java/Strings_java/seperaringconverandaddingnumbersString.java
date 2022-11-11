package Strings_java;

public class seperaringconverandaddingnumbersString {

	public static void main(String[] args) {
		
		String s="a11b22c33";
		int sum=0;
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			char charr=s.charAt(i);
			if(charr>='0' && charr<='9')
			{
				int n=charr-48;
				num=num*10+n;
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		System.out.println(sum+num);

	}

}
