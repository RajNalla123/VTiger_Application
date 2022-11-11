package CollectionFramework;

import java.util.Stack;
import java.util.Vector;

public class Stackin_Vector {

	public static void main(String[] args) {
		
		Stack s=new Stack<>();
		s.add('n');
		s.push("nalla");
		s.add(123);
	    s.push("my name");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
	}

}
