package Javaprograms;

public class Armstrongno {

	public static void main(String[] args) {
		int num=153;
		int sum=0,rem=0,temp=0;
		while (num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
    
	    if(num==temp)
	{
		System.out.println("given num is armstrong");
	}
	    else
	    {
	    	System.out.println("not arm strong no");
	    }
	}
}



