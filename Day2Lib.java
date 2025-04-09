package com.testing250.JavaDay2;

import java.util.Scanner;

public class Day2Lib {
	// Take the input for 3*3 2d array and siaplay the array
	
	public void TwoDArray() {
		
		// Declare the 2D array
		
		int arr[][] = new int[3][3];
		
		int i,j;
		Scanner c = new Scanner(System.in);
		
		// Take the input
		
		for( i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				arr[i][j]= c.nextInt();
			}
			
			
		}
		
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
