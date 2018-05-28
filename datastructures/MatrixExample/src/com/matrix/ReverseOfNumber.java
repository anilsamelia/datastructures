package com.matrix;

public class ReverseOfNumber {
		public static void reverse(int number){
			int r=0;
			while(number!=0){
				r=r*10+number%10;
				number=number/10;
			}
			System.out.println(r);
		}
		
		
		public static void fibnoses(){
			/*int n, a = 0, b = 0, c = 1;
			for(int i=1; i<10; i++){
				a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
			}*/
			int a=0, b=1, c=1;
			for(int i=1; i<10; i++){
				a=b;
				b=c;
				c=a+b;
				System.out.print(b+" ,");
			}
			
		}
		
		public static void primeNumer(int num){
			for(int i=2; i<=num/2; i++){
				if(num%i==0){
					System.out.println("Number not prime");
					break;
				}
			}
		}
	
	public static void main(String[] args) {
		//reverse(12345);
		//fibnoses();
		primeNumer(31);
	}

}
