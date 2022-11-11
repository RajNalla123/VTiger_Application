package CollectionFramework;

import java.util.Vector;

public class VectorRemainingMethods {

	public static void main(String[] args) {
		
		Vector a=new Vector<>();
		a.addElement(12);
		a.add("nalla");
		a.add(22.2);
		a.add(12234);
		a.add(3, "my name");
		System.out.println(a);
		a.removeElement("my name");
		System.out.println(a);
		a.removeAllElements();
		System.out.println(a);

	}

}
