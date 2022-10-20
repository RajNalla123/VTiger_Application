package Objectclass;

public class Objclass {
	int age;
	String name;
	
	Objclass(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "objclass [age=" +age+", name="+name+ "]";
	}
	public static void main(String[] args)
	{
		Objclass o =new Objclass(12, "Raj");
		System.out.println(o.toString());
	}

}
