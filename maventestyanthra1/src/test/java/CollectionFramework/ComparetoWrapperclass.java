package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparetoWrapperclass implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String i=(String)o1;
		String i1=(String)o2;
		
		if(i.compareTo(i1)>0)
		{
		return 1;
	}
		else if(i.compareTo(i1)<0)
		{
			return -1;
			
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList<>();
		a.add("karna");
		a.add("krishna");
		a.add("kamsa");
		a.add("kunthi");
		System.out.println(a);
		
		ComparetoWrapperclass cf=new ComparetoWrapperclass();
		
		Collections.sort(a, cf);


}
}