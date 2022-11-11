package MapsINcollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> l=new LinkedHashMap<>();
		l.put("s", 25);
		l.put("nalla", 36);    //it wiil  not accept duplicates
		l.put("Raj", 49);
		l.put("Raj", 94);
		l.put("nalla", 26);
		l.put(null,null);
		System.out.println(l);
		
		System.out.println(l.get("nalla"));
		System.out.println(l.remove("Raj"));
		
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<>(l);
		System.out.println(l1);
		
		Set<String> kset = l1.keySet();
		for(String ks:kset)
		{
			System.out.println(ks);
		}
		
		Collection<Integer> val = l1.values();
		Iterator i=val.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Set<Entry<String, Integer>> entry = l1.entrySet();
		//for(Entry<String, Integer> eset:entry)
		//{
		//	System.out.println(eset);
		//}
		
		for(int j=0;j<entry.size();j++)
		{
			System.out.println(entry.toString());
		}

	}

}
