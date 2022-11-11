package CollectionFramework;

import java.util.ArrayList;

public class Passingparametertoconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
		
		a.add("sdet-9");
		a.add('c');
		a.add(12);

		
		ArrayList a1=new ArrayList(a);
		a1.add("sdet-9");
		a1.add('c');
		a1.add(12);
		
		System.out.println(a1);

	}

}
