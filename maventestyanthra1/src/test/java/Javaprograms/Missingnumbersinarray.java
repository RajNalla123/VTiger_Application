package Javaprograms;

public class Missingnumbersinarray {

	public static void main(String[] args) {
		int a[]= {2,5,1,6,7};
		boolean status = false;
		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i == a[j])
				{
					status=true;
					break;
				}
			}
			if(status==false)
			{
				System.out.print(i+" ");
			}
			else
			{
				status=false;
			}
		}
	}

}
