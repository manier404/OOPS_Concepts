package org.corejava.interview;

public class InterfaceMani implements InterfaceRbi,Interfacemom {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
	System.out.println("hi");	
	}

	@Override
	public void method2() {
	System.out.println("hello");
	}
	public static void main(String[] args) {
		InterfaceMani im = new InterfaceMani();
		im.method1();
		im.method2();
		im.method4();
	}

	@Override
	public void method4() {
		System.out.println("interface multiple inheritance");
		
	}

	

}
