package CollectionFramework;

import java.util.ArrayList;

public class Retainall_ContainsallaMethods {

	public static void main(String[] args) {
		
ArrayList a=new ArrayList();
		
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		a1.add("nalla");
		a1.add(a);
		System.out.println(a1);
		//a1.retainAll(a);        //retains common objects
		System.out.println(a1.contains(a));
		System.out.println(a1);
	}

}
