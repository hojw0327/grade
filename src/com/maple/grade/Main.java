package com.maple.grade;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws IOException {
		
		Calculator calculator = new Calculator();
		Printer printer = new Printer();
		TextPrinter textprinter = new TextPrinter();
		
		float average=0;
		Scanner stdin = new Scanner(System.in);
		int num=0;
		int sum=0;
		int subject_num=0;
		printer.print("과목 개수를 입력하세요:");
		subject_num=stdin.nextInt();
		for(int i=0;i<subject_num;i++)
		{
			printer.print("점수를 입력하세요:");
			num=stdin.nextInt();
			textprinter.addition_of_content("성적:", calculator.grade(num));
			sum=calculator.add(num,sum);
			
		}
		average=calculator.average(subject_num, sum);
		System.out.println();
		textprinter.addition_of_content("합계:",sum,"평균:",average);

	}
}
		
		
