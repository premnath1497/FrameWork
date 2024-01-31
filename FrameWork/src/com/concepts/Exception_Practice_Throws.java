package com.concepts;

public class Exception_Practice_Throws {
	
	static void test() throws InterruptedException {
		System.out.println("Hello");
		
		Thread.sleep(1000);
		
		System.out.println("Hi");
	}

	static void demo() {
		throw new ArithmeticException(); 
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		test();
	}

}
