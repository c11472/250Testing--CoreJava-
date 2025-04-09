package com.testing250.JavaDay2;

public class Wrapper_Double1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wrapper_Double1 test1 = new Wrapper_Double1();
		double pricetest=test1.ConvertToDouble("997.67");
		System.out.println("Converted Price is :" + " " + pricetest);
		
		int idn = test1.ConvertToInt("998067");
		System.out.println("Converted id in int:" + idn+8);
		
		
		float v = test1.ConvertToFloat("98.08");
		System.out.println(v);
		
		String res5=test1.Convert_double_str(980.80);
		System.out.println(res5.concat("test"));

	}
	
	
	public double ConvertToDouble(String price) {
		
      
		double priceVal = Double.parseDouble(price);
		
		//System.out.println(priceVal);
		return priceVal;
		
		
	}
	
	public String Convert_double_str(double data6) {
		
		String p1 = String.valueOf(data6);
		return p1;
	
	}
	
	public int ConvertToInt(String idnum) {
		int idnum1 = Integer.parseInt(idnum);
		return idnum1;
				
	}
	
	public float ConvertToFloat(String flval) {
		
		float data = Float.parseFloat(flval);
		
		return data;
		
		
	}

}
