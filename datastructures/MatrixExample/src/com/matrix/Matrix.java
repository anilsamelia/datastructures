package com.matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("\nEnter The total element=");
		int input =scan.nextInt();
		int v=	(int) Math.sqrt(input);
		String[][] arry=new String[v][v];
		for (int col = 0; col < arry.length; col++) {
			for (int row = 0; row < arry.length; row++) {
				System.out.println("Enter the value=["+col+","+row+"]");
				arry[col][row]=scan.next();
			}
		}
		////DataDisplay//
		System.out.println();
		int l=v/2;
		for(int i=0; i<v; i++){
			System.out.print("["+l+","+i+"]"+arry[l][i]);
			System.out.print("["+i+","+l+"]"+arry[i][l]);
		}
		
	}

}
