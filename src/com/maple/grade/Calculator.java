package com.maple.grade;

public class Calculator {

	public char grade (int a)
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
	
	public int add (int a,int sum)
	{
			sum = sum+a;
			return sum;
	}
	
	public float average (int a,int sum)
	{
		float ave = 0;
		if(a==0){}
		else
			ave = sum/a;
		return ave;
	}
	
}
