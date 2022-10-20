package Javaprograms;
public class Addingarrays {

	public static void main(String[] args) {
		int a[]= {12,5,65,2};
		int b[]= {2,85,64,21,12};
		int length=a.length;
		if(a.length<b.length) {
		length=b.length;   
	}
	for(int i=0;i<length;i++)
	
	try {
	     System.out.println(a[i]+b[i]);
	}
	catch (Exception e) {
		if(a.length>b.length) {
			System.out.println(a[i]);
		}
		else
		{
			System.out.println(b[i]);
		}
	}
	}
}
	
	

	
			
