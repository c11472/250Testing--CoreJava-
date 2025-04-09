package com.testing250.JavaDay2;

public class StringTestLib {
	
	
	
	
	String s1 = "Hello";
	String s2 = "world";
	String s3;
	String s4=null;
	
	
	public void StringDisplay(String s11) {
	   s11=s1;
	   System.out.println(s11);
	   
	   // check equality
	   
	  boolean res= s11.equals(s1);
	  System.out.println(res);   // 
		
	}
	
	
	
	public String StringConcat() {
		String s12= "testdata";
		String s2 = "test test";
		String res1=s12.concat(s2);
		return res1;
		
	 
	}
	
	public  boolean IgnoreCase() {
		String a = "testInG";
		String b = "TestING";
		boolean res5 = a.equalsIgnoreCase(b);
	
		return res5;
		
		
	}
	
	public void CheckSubString() {
		String p = "Test Atomation Framework";
		
		boolean b = p.contains("Atomation");
		System.out.println(b);
		
		
		
		
		
	}
	
	public  void CheckPhoneNum() {
		String phno = "+91-9988665599";
		if(phno.startsWith("+91-")) {
			System.out.println("The number belongs to India");
		}
	
	}
 
}
