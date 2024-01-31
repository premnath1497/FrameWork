package com.concepts;

public class Count_Total_Number_Of_Character_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I Love Automation";
		int count=0;
		System.out.println(s.length());
		for(int i=0; i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
      System.out.println("Total_Number_Of_Character ="+count);
      
      Integer num1 = 100; 
      Integer num2 = 100; 
      Integer num3 = 500; 
      Integer num4 = 500; 
      
      if(num1==num2){//
          System.out.println("num1 == num2"); 
      }
      else{
          System.out.println("num1 != num2"); 
      }
      if(num3 == num4){ 
          System.out.println("num3 == num4"); 
      }
      else{
          System.out.println("num3 != num4"); 
      }
      
      int no=121;
      int temp=no;
      int rev=0;
      while(no>0) {
    	  rev=rev*10+no%10;
    	  no=no/10;
    	  
      }
      
      if(rev==temp) {
    	  System.out.println("The number is Palindrome");
      }else {
    	  System.out.println("The number is Not Palindrome");
      }
      
      // Palindrome Number
      int num=212;
      int reverse=0;
      int remainder=0;
      int temp1=num;
      while(temp1!=0) {
    	  remainder=temp1%10;
    	  reverse=reverse*10+remainder;
    	  temp1=temp1/10;
      }
      if(reverse==num) {
    	  System.out.println("The number is Palindrome");
      }else {
    	  System.out.println("The number is Not Palindrome");
      }
  }
	}


