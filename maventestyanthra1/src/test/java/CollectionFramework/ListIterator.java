package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator {

	public static void main(String[] args) {
		
		ArrayList <Character> a = new ArrayList();
		a.add('2');
		a.add('1');
		a.add('6');
		System.out.println(a);
		ListIterator i= a.listIterator();
		while(i.hasNext())
		{
			Object s=i.next();
			if(s.equals('2'))
			{
				i.remove();
			}
			System.out.println("2 removed");
			break;
		}
		System.out.println(a);


	}


}
