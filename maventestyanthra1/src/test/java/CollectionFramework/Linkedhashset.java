package CollectionFramework;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		
		LinkedHashSet l= new LinkedHashSet<>();
		l.add("nalla");
		l.add(6);
		l.add(true);
		l.add(true);
		l.add('d');
		l.add(null);
		System.out.println(l);
		
		l.remove('d');
		System.out.println(l);

	}

}
