package com.learn.immutable;

public class TestFoo {
	
	public static void main(String args[]) {
		String s="foo2";
		Foo f=new Foo(s);
		System.out.println("Foo Testing -->"+f.getValue());
	}

}
