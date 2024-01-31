package com.concepts;

public class InstanceMethodDemo {
	
	static int a=10;
	int b=20;
	
	public static void sampleOne() {
		
	}

    public  void sampleTwo() {
    	System.out.println(a);
		sampleOne();
		System.out.println(b);
		sampleThree();
		
	}
    
    public void sampleThree() {
    	
    }
}
