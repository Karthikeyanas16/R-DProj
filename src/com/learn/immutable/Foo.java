package com.learn.immutable;

public class Foo {
	
	private final String myVar;
	
	public Foo(String val) {
		this.myVar = val;
	}
	
	public String getValue() {
		return this.myVar;
	}

}


