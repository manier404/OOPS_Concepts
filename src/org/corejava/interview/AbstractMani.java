package org.corejava.interview;

public class AbstractMani extends AbstractRBI {

	@Override
	public void method1() {
		
		System.out.println("Hi");
	}

	@Override
	public void method2() {
		System.out.println("hello");
		
	}
public static void main(String[] args) {
	AbstractMani ab = new AbstractMani();
	ab.method1();
	ab.method2();
}
	
}
