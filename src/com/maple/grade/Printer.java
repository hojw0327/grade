package com.maple.grade;

public class Printer {
	public static void output(int a) {
		System.out.print(Calculator.grade(a));
	}
	
	public static void sumoutput(int a) {
		System.out.print(a);
	}
	
	public static void averageoutput(int a) {
		System.out.print(Calculator.average(a));
	}
	
	
}
