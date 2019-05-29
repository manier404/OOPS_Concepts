package org.corejava.interview;

public class Construct {
	public Construct() {
		System.out.println("Default or non parameterised Constructor");
	}
	public Construct(int id) 
	{
		System.out.println("parameterised Constructor: "+id);
	}
	public Construct(String Name) 
	{
		System.out.println("parameterised Constructor: "+Name);
	}
	public static void main(String[] args) {
		Construct c = new Construct();
		Construct c1 = new Construct(10);
		Construct c2 = new Construct("Name");
		}
}
