package com.concepts;

public class Child extends Parent {
	public void arrage() {
		System.out.println("Maragge with jaya");
	}
	public void perty() {
		System.out.println("This is My Property");
	}
	public static void main(String[] args) {
		
//		Child c=new Child();
//		c.property();
//		c.marrage();
//		
//		System.out.println();
		
		Parent p = new Child();
		p.get();
		p.pps();
		p.property();
		p.marrage();

	}

}
