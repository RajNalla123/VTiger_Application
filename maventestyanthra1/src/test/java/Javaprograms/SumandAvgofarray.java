package Javaprograms;

public class SumandAvgofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,5,65,2};
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		{
		System.out.println(sum);
		}
		System.out.println(avg);
}
}
