package CollectionFramework;

import java.util.LinkedList;

public class PassingOnecollectiontoanothercollection {

	public static void main(String[] args) {
		
		LinkedList a =new LinkedList<>();
		a.add(12);
		a.add("nalla");
		a.add(22.2);
		System.out.println(a);
		LinkedList a1 =new LinkedList<>(a);
		a1.add(12345);
		System.out.println(a1);

	}

}
