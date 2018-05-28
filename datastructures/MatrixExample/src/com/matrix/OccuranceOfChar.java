package com.matrix;

public class OccuranceOfChar {
	
	static void ocurreanc(String s){
		
		for(int i=0; i < s.length(); i++){
			int counter=0;
			for(int j=0; j<s.length(); j++){
				
				if(j < i  && s.charAt(i)==s.charAt(j)){
					break;
				}
				
				if(j >= i && s.charAt(i)== s.charAt(j) ){
					counter++;
				}
			}
			if(counter>0){
			System.out.println(s.charAt(i)+"-----"+counter);
			}
		}
	}

	public static void main(String[] args) {
		String s="ANILAAAHAJHAAAA";
		ocurreanc(s);

	}

}
