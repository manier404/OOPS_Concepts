package org.corejava.interview;

public class MethodOverloading {
	
	private void method1(int a) {
		for (int i = 0; i <a; i++) {
			System.out.println("Count of a "+i);
		}
	}
	private void method1(int a,String b ) {
		String Name = b;
		for (int i =Name.length(); i >  0; i--) {
			System.out.println("reverse "+i); 
		}
}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.method1(10);
		mo.method1(10,"Mani");
		
	}
}
