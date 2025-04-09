package com.testing250.JavaDay2;

import java.util.Arrays;

public class ArraysTest {
	
	public static void main(String[] args) {
		ArraysTest obj = new ArraysTest();
		obj.ArraySort();
		
	}
	
	public void ArraySort() {
		int arr[] = {45,89,34,32,51,24};
		
		Arrays.sort(arr);
		
		// Traverse the array
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		
		int index =Arrays.binarySearch(arr, 34);
		System.out.println(index);
		
		
		if(index>=0 && index<=arr.length-1) {
			System.out.println("The value is present");
		}
		
	   
		
		
		
		
		
	}

}
