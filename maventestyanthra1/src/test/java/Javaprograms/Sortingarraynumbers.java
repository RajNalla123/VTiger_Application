package Javaprograms;

public class Sortingarraynumbers {

	public static void main(String[] args) {
		int a[]= {0,1,1,0,0,0,1,0,1,0};
		int b[]=new int [a.length];
		int start=0;
		int end=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[start]=a[i];
				start++;
			}
			else {
				b[end]=a[i];
				end--;
			}
		}

	
	for(int i=1;i<b.length-1;i++)
	{
		System.out.print(b[i]);
	}
		
	}

}

