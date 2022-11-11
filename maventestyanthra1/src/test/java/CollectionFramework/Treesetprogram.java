package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetprogram implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer)o1;
		Integer i1=(Integer)o2;
		
		if(i<i1)
		{
			return 1;
		}
		else if(i>i1)
		{
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet<>(new Treesetprogram());
		t.add(12);
		t.add(23);
		t.add(43);
		t.add(37);
		
		System.out.println(t);
		
	for(Object list:t)
	{
		System.out.println(list);
	}
	}
	
	}


