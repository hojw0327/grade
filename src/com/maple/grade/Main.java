package com.maple.grade;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		int allsum=0;
		Scanner stdin = new Scanner(System.in);
		int num[] = new int[10];
		for(int i=0;i<5;i++)
		{
			System.out.print("점수를 입력하세요:");
			num[i]=stdin.nextInt();
			System.out.print("성적:" );
			Printer.output(num[i]);
			System.out.println();
			allsum=Calculator.total(num[i]);//여기서 allsum은 150이됨
		}
		
		System.out.println();
		System.out.print("합계:");
		Printer.sumoutput(allsum); 
		System.out.println();
		System.out.print("평균:");
		Printer.averageoutput(allsum);

	}
}
		
		
