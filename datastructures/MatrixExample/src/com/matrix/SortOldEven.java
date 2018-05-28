package com.matrix;

import java.util.Arrays;

public class SortOldEven {
	public static int[] sort(int arry[]){
		int i=0, j=arry.length-1; 
		for(int k=i ; k<j; k++ )	{
			while(i<j){
				if(arry[i]%2==1){
					break;
				}
				i++;
			}
			while(i<j){
				if(arry[j]%2==0){
					break;
				}
				j--;
			}
			if(i>=j){
				break;
			}else{
				int t=arry[i];
				arry[i]=arry[j];
				arry[j]=t;
				i++;
				j--;}
		}
		for(int q=0; q<arry.length; q++){
			for(int r=q; r<arry.length-1; r++){
				if(arry[r]%2==0 && arry[r+1]%2==0){
					if(arry[r] > arry[r+1]){
						int t=arry[r];
						arry[r]=arry[r+1];
						arry[r+1]=t;
						
					}else if(arry[r]%2==1 && arry[r+1]%2==1){
						if(arry[r] > arry[r+1]){
							int t=arry[r];
							arry[r]=arry[r+1];
							arry[r+1]=t;
					}else{
						
					}
					}
				}
			}
		}
		
		
		
		
		return arry;
	}
	public static int[] sortOld(int[] arry){
		int even=0; int old=arry.length-1;
		while(even < old){
			if(arry[even]%2==0){
				even++;
			}			
			if(arry[old]%2!=0){
				old--;
			}
			
			if(arry[even]%2!=0 && arry[old]%2==0){
				int t=arry[old];
				arry[old]=arry[even];
				arry[even]=t;
				even++;
				old--;
			}
			if(even>=old){
				break;
			}
		}
		System.out.println(even+"  "+old);
		return arry;
	}





	public static void main(String[] args) {
		int[] array={3,1,2,5,4,6,7,9,8,10,11,12,13,14,15,16,17,18,19,20};

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(sort(array)));
	}
}
