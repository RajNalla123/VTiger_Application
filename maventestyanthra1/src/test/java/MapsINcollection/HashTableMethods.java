package MapsINcollection;

import java.util.Hashtable;

public class HashTableMethods {

	public static void main(String[] args) {
		
		Hashtable <String,Integer> t=new Hashtable<>();
		t.put("s", 25);
		t.put("nalla", 36);    //it wiil  not accept duplicates as key but it is accept duplicates as values
		t.put("Raj", 49);
		t.put("Raj", 94);
		t.put("nalla", 26);
		t.put("Reddy", 134);
		System.out.println(t);
		
		System.out.println(t.get("Reddy"));  //to get value from hashtable
		System.out.println(t.remove("nalla"));  //to remove from hashtable
		

	}

}
