package com.classprograms;

class B extends Thread implements Runnable
{
 public void run()
 {
  for(int i=0;i<20;i++)
  {
   System.out.println("i value is :"+i);
  }
 }}
public class newThread {

 public static void main(String[] args) {
  B s=new B();
  Thread t=new Thread(s);
  s.start();
  for(int x=0;x<20;x++)
  {
   System.out.println("x value is :"+x);
  
 }
	
 }

}
