package MapsINcollection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashtablePrintkeysvalues {

	public static void main(String[] args) {
		
		Hashtable <String,Integer> t=new Hashtable<>();
		t.put("s", 25);
		t.put("nalla", 36);    //it wiil  not accept duplicates as key but it is accept duplicates as values
		t.put("Raj", 49);
		t.put("Raj", 94);
		t.put("nalla", 26);
		t.put("Reddy", 134);
		System.out.println(t);
		
		
		Hashtable <String,Integer> t1=new Hashtable<>(t);
		System.out.println(t1);
		
		System.out.println("Printing keys");
		Set<String> ks = t1.keySet();
		for(String kset:ks)
		{
			System.out.println(kset);
		}
		
		System.out.println("Printing values");
		Collection<Integer> val = t1.values();
		Iterator i=val.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				
				System.out.println("printing entryset");
				Set<Entry<String, Integer>> entry = t1.entrySet();
				for(Entry<String, Integer> eset:entry)
				{
					System.out.println(eset);
				}
	}

}
