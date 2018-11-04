package com.learn.designpattern.factorypattern.test;

import com.learn.designpattern.factorypattern.Computer;
import com.learn.designpattern.factorypattern.ComputerFactory;

import com.learn.designpattern.factorypattern.Laptop;

public class FactoryPatternTest {
	
	public static void main(String args[]) {
		Computer pc = ComputerFactory.getComputer("PC", "4 GB", "500 TB", "i5 Processor");
		Computer server = ComputerFactory.getComputer("Server", "16 GB", "2 TB", "i7 Processor");
		Computer laptop = ComputerFactory.getComputer("Laptop", "12 GB", "250 TB", "Dual Core Processor");
		
		Laptop lp = new Laptop("12 GB", "3 TB", "Dual Core Processor");
		
		
		System.out.println("PC Configuration : "+pc);
		System.out.println("Server Configuration : "+server);
		System.out.println("Laptop Configuration : "+lp);
		System.out.println("Laptop Configuration : "+laptop);
	}

}
