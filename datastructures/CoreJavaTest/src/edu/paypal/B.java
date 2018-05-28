package edu.paypal;
import java.util.Arrays;

public class B {
	
		

    
	public static void main(String[] args) {
		int b[]={9,11,13,15,17,20,21};
		int a[]={10,14,18,19};
		int arr[]=new int[a.length+b.length];
		int q=0;
		int w=0;
		for(int i=0; i<arr.length; i++){
			if( q<a.length && w<b.length){
				if(a[q]<b[w]){
					arr[i]=a[q];
					q++;
				}else{
					arr[i]=b[w];
					w++;
				}
			}else{
				try{arr[i]=a[q];
				q++;
				}
				catch(ArrayIndexOutOfBoundsException e){
					arr[i]=b[w];
					w++;
				}
			}

		}

		System.out.println(Arrays.toString(arr));

	}


}
