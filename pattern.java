package com.classprograms;

public class pattern {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int i,j,sum=0,a=-1,b=1;
  for(i=1;i<=5;i++)
  {
   for(j=1;j<i;j++)
   {
    sum=a+b;
    a=b;
    b=sum;
    System.out.print(sum+" ");
   }
   System.out.println();
   }
   
   }
   
   
   }
