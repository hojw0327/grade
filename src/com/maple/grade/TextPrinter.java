package com.maple.grade;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class TextPrinter {
	TextPrinter() throws IOException {
		FileOutputStream craetion = new FileOutputStream("C:/java/test.txt");
		craetion.close();
	}
	
	public void addition_of_content(String a,char chr) throws IOException {
		Printer printer = new Printer();
		printer.print(a);
		printer.print(chr);
		System.out.println();
		PrintWriter printwriter = new PrintWriter(new FileWriter("C:/java/test.txt",true));
		printwriter.write(a+chr);
		printwriter.println();
		printwriter.close();
	}
	public void addition_of_content(String a,int sum,String b,float average) throws IOException { 
		Printer printer = new Printer();
		printer.print(a);
		printer.print(sum);
		System.out.println();
		printer.print(b);
		printer.print(average);
		System.out.println();
		PrintWriter printwriter = new PrintWriter(new FileWriter("C:/java/test.txt",true));
		printwriter.write(a+sum);
		printwriter.println();
		printwriter.write(b+average);
		printwriter.println();
		printwriter.close();
		
	}

	

	
}


