package com.classprograms;

public class Exceptiondemo {

 public static void main(String[] args) throws Exception {
  // TODO Auto-generated method stub
  int age=19;
  if(age>=18)
  {
   System.out.println("Eligible for voting");
  }
   else
   {
    System.out.println("Not eligible vor voting");
   }
  }

 }

class Vote extends Exception
{
 Vote(String msg)
 {
  super(msg);
  }
 }
