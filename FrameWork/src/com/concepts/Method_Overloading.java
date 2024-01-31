package com.concepts;

public class Method_Overloading {
	
	public void m1() {
		System.out.println("This is M1 Method with no parameter");
	}

	public void m1(int a) {
		System.out.println("This is M1 Method With one parameter");
	}
	
	public void m1(int c, int d) {
		System.out.println("This is M1 Method With double integer Parameter");
	}
	
	public void m1(String s) {
		System.out.println("This is M1 Method With String Parameter");
	}
	
	public static void main(String[] args) {
	
		Method_Overloading mo=new Method_Overloading();
		mo.m1();
		mo.m1(10);
		mo.m1(20,30);
		mo.m1("Prem");

	}

}
