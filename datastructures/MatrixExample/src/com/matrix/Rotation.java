package com.matrix;

import java.util.Arrays;

public class Rotation {
	static void rotionPerKeepRoot(){
		int arry[]={1,2,3,4,5,6,7,8,9};
		int input=9;

		for(int i=0; i<arry.length; i++){
			int temp=arry[0];
			if(temp==input)
				break;
			for (int j = 0; j < arry.length-1; j++) {
				arry[j]=arry[j+1];
			}
			arry[arry.length-1]=temp;
			System.out.println(Arrays.toString(arry));
		}
	}


	static int[] aryyRotation(int arry[], int order){
			int j=0;
					

		return arry;

	}



	public static void main(String[] args) {
		int arry[]={6, 7, 8, 9, 1, 2, 3, 4,5};
		aryyRotation(arry, 2);
	}

}
