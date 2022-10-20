package com.genericutility;

import java.sql.Date;

import com.github.javafaker.Faker;

public class Fakerutility {
	public static void main(String[] args) {
		Faker faker=new Faker();
		String fname = faker.address().firstName();
		System.out.println(fname);
		
		String cityname = faker.address().city();
		System.out.println(cityname);
		
		String name = faker.name().lastName();
		System.out.println(name);
		
		
		
	 java.util.Date date=new java.util.Date();
	 String d = date.toString();
	 System.out.println(d);
	 
	 String[] arr = d.split(" ");
	 
	 String day = arr[0];
	 String month =  arr[1];
	 String date1 = arr[2];
	 String year = arr[5];
	 
	 String exp= day+" "+month+" "+date1+" "+year;
	 System.out.println(exp);
	 
	}

}
