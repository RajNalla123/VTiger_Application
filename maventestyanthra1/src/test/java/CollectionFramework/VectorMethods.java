package CollectionFramework;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector a=new Vector<>();
		a.addElement(12);
		a.add("nalla");
		a.add(22.2);
		a.add(12234);
		a.add(3, "my name");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.elementAt(1));
		System.out.println(a.firstElement());
		System.out.println(a.lastElement());

	}

}
