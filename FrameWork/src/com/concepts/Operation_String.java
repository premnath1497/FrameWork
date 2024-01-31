package com.concepts;

public class Operation_String {

	public static void main(String[] args) {
		
		String s="PremnathLLLQWE&&&**##$%^&*@123456";
		String pps=s.replaceAll("[A-Z0-9a-z]", "");
		System.out.println(pps);
		
		

	}

}
