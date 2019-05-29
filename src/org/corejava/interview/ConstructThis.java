package org.corejava.interview;

public class ConstructThis {
	
	
	public ConstructThis() {
		this(1000.50f,"Manivannan");
		System.out.println("Default constructor");
	}
public ConstructThis(int id) {
	
	System.out.println("Parameterised constructor "+id );
		
	}
public ConstructThis(Float Salary,String Name ) {
	this(10);
	System.out.println("2 nd Parameterised constructor "+" "+Name+" "+Salary);
}

	public static void main(String[] args) {
		ConstructThis a = new ConstructThis();
		
	}
}
