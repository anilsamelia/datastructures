package edu.paypal;

public class PrintArray {

	int current=0;

	public void odd() throws InterruptedException{
		synchronized (this) {
			
		for (int i = 0; i < 5; i++) {
			wait();
			

				System.out.println(Thread.currentThread().getName()+"---"+current);
				current++;
			
			notify();
		}
	}}



	public void even() throws InterruptedException{
		synchronized (this) {
		for (int i = 0; i <5; i++) {
			notify();
			
				System.out.println(Thread.currentThread().getName()+"---"+current);
				current++;
			
			wait();
		}}
	}


	public static void main(String[] args) {
		PrintArray p=new PrintArray();
		Thread t1=new Thread(){@Override
			public void run() {
			try {
				p.odd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		};
		
		Thread t2=new Thread(){@Override
			public void run() {
			try {
				p.even();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		};
		t1.setName("ODD THREAD");
		t2.setName("EVEN THREAD");
		t1.start();
		t2.start();
	}
}