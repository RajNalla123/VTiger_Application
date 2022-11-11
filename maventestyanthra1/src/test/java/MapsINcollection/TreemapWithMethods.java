package MapsINcollection;

import java.util.TreeMap;

public class TreemapWithMethods {

	public static void main(String[] args) {
		
		TreeMap<String, String> t=new TreeMap<>();
		t.put("n", "raj");
		t.put("r", "Nalla");
		t.put("r", "shekar");
		t.put("s", "reddy");
		
		System.out.println(t);
		System.out.println(t.lastKey());
		System.out.println(t.firstKey());
		System.out.println(t.lastEntry());
		System.out.println(t.firstEntry());
		System.out.println(t.headMap("r"));
		System.out.println(t.tailMap("n"));
		System.out.println(t.descendingKeySet());
		System.out.println(t.descendingMap());
		
		

	}

}
