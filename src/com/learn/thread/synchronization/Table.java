package com.learn.thread.synchronization;

public class Table {
	
	//Without Syschronized
	/*public void printTable(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}*/
	
	//With Syschronized
		public synchronized void printTable(int n) {
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

