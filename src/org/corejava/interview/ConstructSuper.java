package org.corejava.interview;

public class ConstructSuper extends ConstructSuper1 {
	public ConstructSuper() {
		this("8204",9894738299l);
		System.out.println("Default Parameterised ");
	}
public ConstructSuper(String EmpID,long Ph ) {
	super(10);
	System.out.println("Parameterised "+" "+EmpID+" "+Ph);
}
public static void main(String[] args) {
	ConstructSuper c = new ConstructSuper();
}
}
