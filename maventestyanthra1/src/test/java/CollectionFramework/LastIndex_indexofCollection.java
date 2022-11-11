package CollectionFramework;

import java.util.ArrayList;

public class LastIndex_indexofCollection {

	public static void main(String[] args) {
		
		
        ArrayList a=new ArrayList();
		
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		System.out.println(a.lastIndexOf(12));
		
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		a1.add("nalla");
		a1.add(a);
		a1.addAll(1, a);
		System.out.println();

	}

}
