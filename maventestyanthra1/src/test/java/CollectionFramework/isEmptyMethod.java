package CollectionFramework;

import java.util.ArrayList;

public class isEmptyMethod {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		//System.out.println(a.isEmpty());
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		System.out.println(a);
		ArrayList a1=new ArrayList();
		a1.addAll(a1);
		a1.add("nalla");
		a1.add('n');
		System.out.println(a1);
		a1.add(a1);
		System.out.println(a1);
	}

}
