package Arrays_Programs;

public class Adding2arrays {

	public static void main(String[] args) {
		int a[]= {2,5,6,4,8,9};
		int b[]= {3,6,7};
		int c= b.length;
		if(a.length>b.length)
            c=a.length;
	
			for(int i = 0;i<c;i++)
			{
				try
				{
					System.out.println(a[i]+b[i]+" ");
				}
				catch (Exception e)
				{
				if(a.length>b.length)
				{
					System.out.print(a[i]+" ");
				}
				else
				{
					System.out.print(b[i]+" ");
				}
				}
				
			}
			
		}

	}

