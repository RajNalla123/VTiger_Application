package CollectionFramework;

import java.util.LinkedList;

import com.mifmif.common.regex.util.Iterator;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList a =new LinkedList<>();
		a.add(12);
		a.add("nalla");
		a.add(22.2);
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		java.util.Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
