package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CompareTo implements Comparable {
	int age;
	String name;
	
	public CompareTo(int age, String name) {
		this.age = age;
		this.name = name;
	}

	

	@Override
	public String toString() {
		
		return "age=" + age+ " , name=" + name;
	}



	
	public int compareTo(Object o) {
		CompareTo c=(CompareTo)o;
		
		if(name.compareTo(c.name)>0) {
		return 1;
	}
	
	else if(name.compareTo(c.name)<0)
	{
		return -1;
	
	}
	
	return 0;
}


    public static void main(String[] args)
{
	CompareTo c=new CompareTo(26, "sravan");
	CompareTo c1=new CompareTo(12, "tharun");
	CompareTo c2=new CompareTo(45, "raju");
	CompareTo c3=new CompareTo(18, "harisha");
	
	ArrayList a=new ArrayList<>();
	a.add(c);
	a.add(c1);
	a.add(c2);
	a.add(c3);
	
	Collections.sort(a);
	System.out.println(a);
	
	for(Object list:a)
	{
		System.out.println(list);
	}
	
	
}	
	

}



