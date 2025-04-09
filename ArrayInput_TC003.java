package com.testing250.JavaDay2;

import java.util.Scanner;

public class ArrayInput_TC003 {
Scanner c;
public void	AcceptArrayValues(){
	
	
	    double salary[] = new double[10];
	    
	    // Scanner class Object
	    c = new Scanner(System.in);
	    
	    
	    // Take the input
	    
	    for(int i=0;i<=salary.length-1;i++) {
	    	salary[i] = c.nextDouble();
	    }
	    
	    // display array
	    for(double j:salary) {
	    	System.out.print(j + " ");
	    }
	    
	   
	}

public static void main(String[] args) {
	ArrayInput_TC003 test = new ArrayInput_TC003();
	test.AcceptArrayValues();
	
}

}
