package CollectionFramework;

import java.util.ArrayList;

public class AddallbyIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList a=new ArrayList();
		
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		a1.add("nalla");
		a1.add(a);
		a1.addAll(1, a);
		System.out.println(a1);


	}

}
