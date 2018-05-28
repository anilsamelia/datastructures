package com.matrix;

public class TEst {

	public static String reverseString(String str, int length, String temp){
		if(length==-1){
			return temp;
		}
		temp+=str.charAt(length);
		length--;
		return reverseString(str, length, temp);
		
	}
	
	
	public static void print(int num){
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//String str="Choudhary";
		//String s=reverseString(str,str.length()-1,"" );
		//System.out.println(s);
		
		print(5);
		
	}
}
