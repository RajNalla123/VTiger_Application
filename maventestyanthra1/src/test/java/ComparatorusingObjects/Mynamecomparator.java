package ComparatorusingObjects;

import java.util.Comparator;

public class Mynamecomparator implements Comparator {
	
	

	@Override
	public int compare(Object o1, Object o2) {
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		
		if(e.name.compareTo(e1.name)>0)
		{
		return 1;	
		}
		else if(e.name.compareTo(null)<0)
		{
			return -1;
		}
		return 0;
	}
	
	}


