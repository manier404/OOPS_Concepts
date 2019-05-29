package org.corejava.interview;

public class MethodOverridding2 extends MethodOverridding1 {
	public void ManiBankSaving() {
		System.out.println("50%");
	}
		public void ManiBankDeposit(int id) {
			System.out.println(id);
		}
		public static void main(String[] args) {
			MethodOverridding2 mo =new MethodOverridding2();
			mo.ManiBankSaving();
			mo.ManiBankDeposit(56);
		}
}
