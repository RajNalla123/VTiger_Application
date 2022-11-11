package Arrays_Programs;

public class SecondMaxNoinArray {

	public static void main(String[] args) {
		/*int a[]= {5,20,3,25,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				if(a[i]-1>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}
		//for (int i=0;i<a.length;i++)
		System.out.println(a[a.length-2]);
		//System.out.print(a[i]+" ");
	
	}
}*/
		
		//Second way to find Second Max number
		
		int a[]= {5,20,3,25,4};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println(smax);
	}
}
		
		
		
		
		
