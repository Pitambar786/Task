package com.streams;
public class Mythread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread a= new Thread(r);
        Runnable r2 = new Runnable2();
        Thread b = new Thread(r2);
        a.start();
        b.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
    	synchronized (this) {
    		for(int i=1;i<100;i++) {
                System.out.println("thread 2:"+i);
                try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                notify();
            }
		}
        
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++) {
           System.out.println("thread one:"+i);
        }
    }
}