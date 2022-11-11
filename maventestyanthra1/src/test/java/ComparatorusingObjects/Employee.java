package ComparatorusingObjects;

import java.util.ArrayList;
import java.util.Collections;

import CollectionFramework.ComparetoWrapperclass;

public class Employee implements Comparable  {

	String name;
	int age;
	int salary;
	
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		
		if(salary>e.salary)	
		{
		return 1;
	}
		else if(salary<e.salary)
		{
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		
		return "name" + name + ", age=" +age+ ", salary=" +salary;
	}
	
	public static void maun(String[] args)
	{
		Employee e=new Employee("hardik",30,20000);
		Employee e1=new Employee("rohit",35,50000);
		Employee e2=new Employee("virat",34,55000);
		Employee e3=new Employee("smrithi",32,30000);
		
		ArrayList a=new ArrayList<>();
		a.add(e);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		System.out.println(a);
		

		
		//Collections.sort(a);
	
	}
}