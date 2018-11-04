package com.learn.thread.synchronization.staticsync;

public class MyThread4 extends Thread {
	
	public void run() {
		Table.printTable(1000);
	}

}
