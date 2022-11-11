package MapsINcollection;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable t=new Hashtable<>();
		t.put("s", 25);
		t.put('s', 25);    //it wiil  not accept duplicates as key but it is accept duplicates as values
		t.put(22.3, "tyss");
		t.put(123, 'n');
	//	t.put(null, null);  //it will not accept null values
	//	t.put("s", null);
		
		System.out.println(t);
	}

}
