package com.concepts;

public class Practice {
public static void main(String[] args) {
	String s="I Love My India";
//	System.out.println(s.length());
	int count=0;
	for(int i=0; i<s.length(); i++) {
		
		if(s.charAt(i)!=' ') {
			count++;
		}
		
	}
	System.out.println(count);
	
	// Number Palindrome
	int no=120;
	int rev=0;
	int temp=no;
	while(temp!=0) {
		rev=rev*10+temp%10; //121%10 >>1  ==1  //10+2>>12 //120+1>>121
		temp=temp/10; //12  //1
	}
	
	if(no==rev) {
		System.out.println("Number is Palindrome");
	}
	else {
		System.out.println("Number is Not Palindrome");
	}
	
	
}
	
	
}
