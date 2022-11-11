package Arrays_Programs;

public class PrintingDuplicatesinArray {

	public static void main(String[] args) {
		int a[]= {22,6,8,13,6};
		int b[]=new int[a.length];
		int start=0;
		int end=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==a[i])
				{
					b[start]=a[i];
					//start++;
			}
		}
//		else
//		{
//			b[end]=a[i];
//			end--
//			}
		System.out.println(b[start]);
	}
}
