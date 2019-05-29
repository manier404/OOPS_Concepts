package org.corejava.interview;

public class ConstructSuper1 {
	public ConstructSuper1(String Name) {
		System.out.println("Default constructor "+Name );
	}
	public ConstructSuper1(int id) {
		this("Manivannan");
		System.out.println("parameterised constructor "+id);
	}
	
}
