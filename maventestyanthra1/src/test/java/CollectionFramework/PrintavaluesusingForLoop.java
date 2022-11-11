package CollectionFramework;

import java.util.ArrayList;

public class PrintavaluesusingForLoop {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add("sdet-9");
		a.add('c');
		a.add(12);
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

	}

}
