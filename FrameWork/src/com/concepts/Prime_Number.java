package com.concepts;

public class Prime_Number {

	public static void main(String[] args) {
		
		int no=3;
	    boolean prime=true;
	    
	    for(int i=2; i<no; i++) {
	    	if(no%i==0) {
	    		prime=false;
	    	}
	    }
		System.out.println(prime);
		
		int num=10;
		boolean primenum=true;
		
		for(int i=2; i<num; i++) {
			
			if(num%2==0) {
				primenum=false;
			}
		}
		System.out.println(primenum);
		
		String s="Learn Java Programm";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	

}
