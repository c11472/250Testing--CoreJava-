package com.testing250.JavaDay2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c = new Scanner(System.in);
		
		//c.next()  --- String
		//c.nextLine(); --- string witth space
		
//		c.nextInt(); // int 
//		c.nextDouble();
//		c.next().charAt(0);
//		c.nextLine();  // String inputs with space
		
		
		// Take a single char input
		
		//char ch;
		//ch = c.next().charAt(0);
		//System.out.println("Value of ch is "+ ch);
		
		String empDetails;
		
		empDetails = c.nextLine();
		
		System.out.println(empDetails); // Test Automation Framework
		
		
		
		

	}

}
