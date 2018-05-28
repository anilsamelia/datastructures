package com.matrix;

import java.util.TreeSet;

public class ArrayFloor {
	
	static int floor(int[] arry , int key){
		int index=0;
		for(int i=0; i<arry.length; i++){
			if(arry[i]>=key){
				index=i-1;
				break;
			}
		}
		if(index==-1){
			index+=1;
		}
		if(key>=arry[arry.length-1]){
			index=arry.length-1;
		}
		return arry[index];
	}
	

	public static void main(String[] args) {
	//	int[] arry={1,3,6,7,9,11 ,16,18};
	//	System.out.println(floor(arry,20));
		
		
		
	}

}
