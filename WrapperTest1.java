package com.testing250.JavaDay2;

public class WrapperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String price = "6500";
		int priceval=Integer.parseInt(price);
		System.out.println(priceval);
		
		String Oval = price.valueOf(priceval);
		System.out.println(Oval);

	}

}
