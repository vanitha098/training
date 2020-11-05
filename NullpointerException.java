package com.classprograms;

public class NullpointerException {

 public static void main(String[] args) {
  try {
 String str=null;
 System.out.println("length of the string is="+str.length());

 }
  catch(NullPointerException ne)
  {
   System.out.println("Example for Nullpointer Ecxception");
   }
   
  }
  }
