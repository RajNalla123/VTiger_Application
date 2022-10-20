package Objectclass;

public class Boxingclasswrapper {

	public static void main(String[] args) {
		
		//Boxing
		int a=12;
		Integer a1=Integer.valueOf(a);
		System.out.println(a1);
	
		
		//Auto Boxing
	    int b=125;
		Integer b1=b;
	    System.out.println(b1);
	
	    //Un Boxing (1 st way)
	    int i=22;
	    Integer i1=Integer.valueOf(i);
	    int i2=i1.intValue();
	    System.out.println(i2);
	    
	    //un Boxing (2nd way)
	    Short s=101;
	    short s1=s.shortValue();
	    System.out.println(s1);
	    
	    //un Boxing (3rd way)
	    Double d=new Double(a);
	    double d1=d.doubleValue();
	    System.out.println(d1);
	    
	    //Auto un Boxing
	    Integer in=20;
	    int in1=in;
	    System.out.println(in1);
	    
	    //Auto un Boxing
	    char cr=new Character('e');
        System.out.println(cr);
	    
	    //converting String in to integer values
	    String st="123";
	    int n=Integer.parseInt(st);
	    System.out.println(n+1);
	    
	    double d2=Double.parseDouble(st);
	    System.out.println(d2=1.44);
	    
	    boolean bn=Boolean.parseBoolean(st);
	    System.out.println(bn);
	    
	    short sh=Short.parseShort(st);
	    System.out.println(sh+144);
	    
	    long l=Long.parseLong(st);
	    System.out.println(l);   

	}
}


