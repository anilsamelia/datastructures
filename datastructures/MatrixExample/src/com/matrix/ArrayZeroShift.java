package com.matrix;

import java.util.Arrays;

public class ArrayZeroShift {
	
	static int[] shiftzero(int[] arry){
		int j=arry.length-1;
		for (int i = 0; i < arry.length; i++) {
			if(arry[i]==0){
				while(j>i){
					if(arry[j]!=0){
						int t=arry[i];
						arry[i]=arry[j];
						arry[j]=t;
						break;
					}
					j--;
				}
				
			}
		}
		return arry;
	}

	public static void main(String[] args) {
		int arry[]={10,0,0,2,3,5,6,8,9,0,44,3,0};
		System.out.println(Arrays.toString(shiftzero(arry)));
	}
}
