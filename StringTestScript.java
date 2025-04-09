package com.testing250.JavaDay2;

public class StringTestScript {
	public static void main(String[] args) {
		StringTestLib obj = new StringTestLib();
		
		
		
		StringTestScript obj1 = new StringTestScript();
		
		obj1.CountWorrdsInString();
		obj.StringDisplay("test");
		
		
		String res4=obj.StringConcat();
		
		System.out.println(res4);
		
		boolean r=obj.IgnoreCase();
		System.out.println(r);
		
		
		obj.CheckSubString();
		
		obj.CheckPhoneNum();
		
		obj1.CheckEmpty();
		
		obj1.ConvertToCharArray();
		
		obj1.SubStrDemo();
		
		
		
		
	}
	
	
	public void CountWorrdsInString() {
		String value = "Hello There I am using facebook";
		
		
		String val[]=value.split(" ",4);
		
		//System.out.println(val.length);
		for(String p1:val) {
			System.out.println(p1);
		}
		
		
	}
	
	
	public void CheckEmpty() {
		String val = "";
		
		if(val.isEmpty()) {
			System.out.println("Empty string");
		}
	}
	
	public void ConvertToCharArray() {
		String val4 = "Testing 250";
		
		
		
		char val6[] = val4.toCharArray();
		
		for(char ch:val6) {
			System.out.print(ch+ " ");
		}
	}
	
	
	public void SubStrDemo() {
		String valk = "Test data is completed";
	   String pp= valk.substring(4, 9);
	   System.out.println(pp);
	    
	}

}
