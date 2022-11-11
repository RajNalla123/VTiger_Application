package CollectionFramework;

import java.util.ArrayList;

public class RemoveinCollection {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		//a.remove(0);
		a.removeAll(a);
		System.out.println(a);

	}

}
