package com.learn.thread.synchronization.staticsync;

public class MyThread3 extends Thread {
	
	public void run() {
		Table.printTable(100);
	}

}
