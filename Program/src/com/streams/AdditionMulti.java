package com.streams;

public class AdditionMulti {
	public static void main(String args[ ]) {
		Loc loc=new Loc();
		Thread add = new Thread(new ThreadExample("add",loc));
		add.setName("add");
		Thread mul= new Thread(new ThreadExample("mul",loc));
		mul.setName("mul");
		add.start();
		mul.start();
		System.out.println("main completed");
	}
	

}

class Loc {
	int a=2,b=5,c=4;volatile int r,r1=0;
	
}
class ThreadExample implements Runnable{
	Loc loc = null;
	int res1=0;
	int res2=0;
	int i=0;
	public ThreadExample(String threadName,Loc addmul){
		this.loc = addmul;
	}
	public void run() {
		synchronized(loc) {
			while(true) {
				if(Thread.currentThread().getName().equalsIgnoreCase("add") && loc.r<=100) {
					int temp = loc.a+loc.b+loc.c;
					System.out.println("a+b+c="+temp);
					if(loc.r+temp<=100)
					loc.r=loc.r+temp;
					System.out.println("REsult"+loc.r);
					loc.notify();
					try {
						loc.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				
				if(Thread.currentThread().getName().equalsIgnoreCase("mul") && loc.r1<=100) {
					int temp = loc.a*loc.b*loc.c;
					System.out.println("a*b*c="+temp);
					if(loc.r1+temp<=100)
					loc.r1=loc.r1+temp;
					System.out.println("REsult"+loc.r1);
					loc.notify();
					try {
						loc.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					
				}
				
				if(loc.r+(loc.a+loc.b+loc.c)>=100 && loc.r1+(loc.a*loc.b*loc.c)>=100) {
					break;
				}
			}
			System.out.println("loop completed");
			Thread.interrupted();
			loc=null;
			
		}
		
	}
}
