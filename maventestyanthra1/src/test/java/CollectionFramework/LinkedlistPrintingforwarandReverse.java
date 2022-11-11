package CollectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistPrintingforwarandReverse {

	public static void main(String[] args) {
		
		LinkedList a =new LinkedList<>();
		a.add(12);
		a.add("nalla");
		a.add(22.2);
		a.add(12234);
		a.add(3, "my name is raj");
		System.out.println(a.get(3));
		System.out.println(a);
		
		ListIterator l=a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("printing reverse");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}

	}

}
