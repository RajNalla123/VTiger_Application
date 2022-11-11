package Arrays_Programs;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						int num=456,sum=0,rem=0;
				while(num>0)
				{
					rem=num%10;
					sum=sum+rem;
					num=num/10;
					
				}
				System.out.println(sum);

			}

		

	}


