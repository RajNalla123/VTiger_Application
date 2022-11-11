package Arrays_Programs;

public class sumofsumofnumbers {

	public static void main(String[] args) {
		int num=568;
		while(num>9)
		{
			int sum=0;
			while(num>0)
			{
				//num=num%10; tried with this line no result
				sum=sum+num%10;
				num=num/10;
			}
			num=sum;
			System.out.println(sum);
		}
		System.out.println("final output is"+num);

	}

}
