package MapsINcollection;

import java.util.Hashtable;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap <String,Integer> hm=new java.util.HashMap<>();
		hm.put("s", 25);
		hm.put("nalla", 36);    //it wiil  not accept duplicates as key but it is accept duplicates as values
		hm.put("Raj", 49);
		hm.put("Raj", 94);
		hm.put("nalla", 26);
		hm.put(null,null);
		System.out.println(hm);

	}

}
