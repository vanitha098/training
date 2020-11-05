package com.classprograms;

public class InterruptedException {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.println("main starts");
  try {
   display();
  } catch (java.lang.InterruptedException e) {
   e.printStackTrace();
   
  }
  System.out.println("main ends");
 }

 public static void display() throws java.lang.InterruptedException
 {
  System.out.println("Hi welcome");
  }
  
  }
