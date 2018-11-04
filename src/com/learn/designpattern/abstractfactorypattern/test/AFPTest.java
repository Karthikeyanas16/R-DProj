package com.learn.designpattern.abstractfactorypattern.test;

import com.learn.designpattern.abstractfactorypattern.PCFactory;
import com.learn.designpattern.abstractfactorypattern.ServerFactory;
import com.learn.designpattern.abstractfactorypattern.Computer;

public class AFPTest {
	
	public static void main(String args[]) {
		
		testAbstractFactoryPattern();
	}
	
	private static void testAbstractFactoryPattern() {
		Computer pc = com.learn.designpattern.abstractfactorypattern.ComputerFactory.getComputer(new PCFactory("12 GB", "500 TB", "i3 Processor"));
		Computer server = com.learn.designpattern.abstractfactorypattern.ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "i5 Processor" ));
		
		System.out.println("PC Configuration -----> "+pc);
		System.out.println("Server Configuration ----> "+server);
	}
	
	

}
