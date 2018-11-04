package com.learn.thread.synchronization.staticsync;

public class MyThread1 extends Thread {
	
	public void run() {
		Table.printTable(1);
	}

}
