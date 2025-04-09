package com.testing250.JavaDay2;

import java.util.Scanner;

public class StringBufferLib {
	
	String v1="test data";

	StringBuffer sb=new StringBuffer(v1);
	
	
	Scanner c = new Scanner(System.in);
	
	// create a stringbuffer and store the data , display the data
	public void sb1() {
		
		//String v1="test data";
		
		System.out.println(sb);
		
	}
	// Taking input
	public void sb2() {
		String s1 = c.nextLine();
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(sb1);
	
		
	}
	
	// Append
	
	public void TestAppend() {
		String data = "1234";
		StringBuffer sb3 = new StringBuffer(data);
		System.out.println(sb3.append("56464"));
		System.out.println(sb3);
    	}
	
	public String PerformReverse(String Str) {
		StringBuffer sb3 = new StringBuffer(Str);
		
		System.out.println(sb3);
		
		StringBuffer sb4 =  sb3.reverse();
		String val4 = sb4.toString();
		return val4;
		
		
	}
	
	public void Delete_from_buffer() {
		StringBuffer sb5 = new StringBuffer("Test automation framework");
		sb5.delete(5, 14);
		System.out.println(sb5);
	}
	
	
	public void Insert_Into_Buffer() {
		String v6 = "test data";
		StringBuffer p = new StringBuffer(v6);
		
		p.insert(5, "55992896 ");
		System.out.println(p);
	}
	
	
	
	public static void main(String[] args) {
		StringBufferLib o1= new StringBufferLib();
		o1.sb1();
		
		
		o1.sb2();
	    o1.TestAppend();
	    String result = o1.PerformReverse("hello123test");
		System.out.println(result + "reversed data");
		
		o1.Delete_from_buffer();
		o1.Insert_Into_Buffer();
		
		
		
	}
	
	
	
}
