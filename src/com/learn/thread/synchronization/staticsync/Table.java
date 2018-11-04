package com.learn.thread.synchronization.staticsync;

public class Table {
	
	static synchronized void printTable(int n) {
		
		for(int i=0;i<n;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
