package com.classprograms;

public class ArrayindexoutofboundException {

 public static void main(String[] args) {
  try {
  int a[]=new int[10];
  a[11]=9;
  
 }
  catch(ArrayIndexOutOfBoundsException ae)
  {
   System.out.println("Example for ArrayIndexOutOfBoundsException");
   }
   
   }}
