package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparetoWrapperclasses1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer)o1;
		Integer i1=(Integer)o2;
		
		if(i>i1)
		{
		return 1;
	}
		else if(i<i1)
		{
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList<>();
		a.add(12);
		a.add(21);
		a.add(6);
		a.add(45);
		
		System.out.println(a);
		
		ComparetoWrapperclasses1 cf=new ComparetoWrapperclasses1();
		Collections.sort(a, cf);
		System.out.println(a);
		

}
}
