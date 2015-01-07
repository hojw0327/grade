package com.maple.grade;

public class Calculator {
	
	static int sum = 0;
	
	public static char grade (int a)
	{
		char chr=0;
		if(a>=90 && a<=100)
			chr='A';
		else if(a>=80 && a<90)
			chr='B';
		else if(a>=70 && a<80)
			chr='C';
		else if(a>=60 && a<70)
			chr='D';
		else if(a<60)
			chr='F';
		
		return chr; 
		
	}
	
	public static int total (int a)
	{
			sum = sum+a;
			return sum;
	}
	
	public static float average (int a)
	{
		float ave = 0;
		ave = sum/5;
		return ave;
	}
	
}
