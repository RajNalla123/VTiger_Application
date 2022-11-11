package CollectionFramework;

import java.util.ArrayList;

public class AddByindex {

	public static void main(String[] args) {
		
ArrayList a=new ArrayList();
		
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		a.add(2, "Rajashekar");
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		a1.add("nalla");
		a1.add(a);
		//a1.addAll(1, a1);
		System.out.println(a1);

	}

}
