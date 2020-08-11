package com.streams;

public class DemoThread extends Thread{
	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ThreadB b=new ThreadB();
		b.start();
		synchronized(b) {
			b.wait(1000);
			System.out.println(b.total);
		}

	}

}

class ThreadB extends DemoThread{
	
	int total = 0;
	public void run() {
		try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void display() throws InterruptedException {
		synchronized(this) {
			for(int i=1;i<100;i++) {
				System.out.println("childThread"+i);
				wait();
			}
			System.out.println();
			this.notify();
			
		}
	}
}
