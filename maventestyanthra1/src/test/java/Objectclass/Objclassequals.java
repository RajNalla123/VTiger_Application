package Objectclass;

public class Objclassequals {
 public static void main(String[] args)
 {
	 Objclassequals o=new Objclassequals();
	 System.out.println(o);
	 Objclassequals o1=new Objclassequals();
	 System.out.println(o1);
	 System.out.println(o.equals(o1));
	 o=o1;
	 System.out.println(o.equals(o1));
	 
 }

}
