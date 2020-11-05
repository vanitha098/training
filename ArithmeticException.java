package com.classprograms;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		System.out.println("main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numerator");
		int a=sc.nextInt();
		System.out.println("enter denominator");
	    int b=sc.nextInt();
	    while(true)
	    {
	    try {
	    	
	    System.out.println("div of Two numbers is="+(a/b));
	    break;
	    }
	    catch (Exception e) {
			System.out.println("Denominator should not be zero");
      System.out.println("Re-enter the value");
			b=sc.nextInt();
		}
	    	

	}
	    System.out.println("main ends");
      
      }}
