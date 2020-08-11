package com.streams;

public class TwoThreadMystery {

	public static int totalThread;

	public static void main(String[] args) {

		ThreadLock threadLock = new ThreadLock();
		totalThread = 2;

		for (int i = 1; i <= totalThread; i++) {
			MysterySolver solver = new MysterySolver(i, threadLock);
			solver.start();
		}

	}

}

class ThreadLock {

	public int counter = 0;
	public int id = 0;

}

class MysterySolver extends Thread {

	public ThreadLock lock;
	public int no;

	public MysterySolver(int no, ThreadLock lock) {
		super("Thread : " + (char) (no + 64));
		this.no = no;
		this.lock = lock;
	}

	public void run() {

		synchronized (lock) {

			while (true) {

				while (lock.id == this.no || (this.no - lock.id - 2 == 0)) {

					try {

						if (lock.counter > 100) {
							break;
						}

						lock.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (lock.counter > 100) {
					break;
				}

				if (this.no == 1) {
					if (lock.counter != 100)
						System.out.println(Thread.currentThread() + " :: " + (lock.counter + 1));
				} else {
					if (lock.counter != 0)
						System.out.println(Thread.currentThread() + " :: " + (lock.counter));
					
					lock.counter = lock.counter + 1;
				}

				lock.id = this.no;
				lock.notifyAll();
			}
		}

	}
}