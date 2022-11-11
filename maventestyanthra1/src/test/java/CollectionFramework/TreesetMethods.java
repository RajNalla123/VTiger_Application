package CollectionFramework;

import java.util.TreeSet;

public class TreesetMethods {

	public static void main(String[] args) {
		
		TreeSet l=new TreeSet<>();
		l.add(25);
		l.add(6);
		l.add(34);
		l.add(26);
	//	l.add("nalla"); //it will not allow heterogenious type of data
	//	l.add(22.2); 
	//	l.add(null);   //it will not allows null values
		
		System.out.println(l);
		
		System.out.println(l.first());
		System.out.println(l.last());
		System.out.println(l);
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l);

	}

}
