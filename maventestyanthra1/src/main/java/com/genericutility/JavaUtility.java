package com.genericutility;

import java.util.Random;

public class JavaUtility {
	public static int generateRanNum()
	{
		Random r=new Random();
		int rannum=r.nextInt(1000);
		System.out.println(rannum);
		return rannum;
		
	}

}
