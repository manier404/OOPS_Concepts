
package org.corejava.interview;

public class Sinheritence extends SingleInheritance {

	private void method3() {
		int a=10,b=20;
		b=a+b;
		System.out.println("method 3 :"+b);
	}
	public static void main(String[] args) {
		Sinheritence si = new Sinheritence();
		si.method1();
		si.method2();
		si.method3();
	}
}
