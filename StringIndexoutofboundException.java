package com.classprograms;

public class StringIndexoutofboundException {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  try {
  String str="Prasadmld";
  System.out.println("Length of the string is="+str.length());
  char c=str.charAt(0);
  c=str.charAt(10);
  System.out.println(c);
  }
  catch(StringIndexOutOfBoundsException se)
  {
   System.out.println("Example for stringindexoutofbound Exception");
   }
   
   
 }
 
 
}
