package edu.paypal.builder;

public class A {
	public static void addLargeThreeNumber(){
		int[] arry={2,4,7,1,66,23,44,8,9,101};
		int a=0, b=0, c=0;
		for(int i=0; i<arry.length; i++){
			if(a < arry[i] ){
				int temp=b;
				b=a;
				c=temp;
				a=arry[i];
			}
			else if(a > arry[i] && b < arry[i] &&  c < arry[i]){
				c=b;
				b=arry[i];
				
			}else if(b > arry[i] && c < arry[i] ){
				c=arry[i];
			}
			
		}
		System.out.println(a+" "+b+" "+c);
		System.out.println(a+b+c);
	}
	
	
	public static void findMissing(){
		int []arry={1,2,3,4,5,7,8,9,10};
		int sum=1;
		for(int i=0; i<10; i++){
			if(arry[i]==sum){
				sum++;
			}else{
				System.out.println("missing no "+sum);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		addLargeThreeNumber();
		 //findMissing();
	}


}
