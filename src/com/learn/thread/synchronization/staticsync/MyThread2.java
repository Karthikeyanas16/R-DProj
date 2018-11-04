package com.learn.thread.synchronization.staticsync;

public class MyThread2 extends Thread {
	
	public void run() {
		Table.printTable(10);
	}

}
