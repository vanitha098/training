package com.classprograms;

public class Sleepdemo extends Thread {
 public void run() {
  for(int i=1;i<=10;i++) {

   try {
    Thread.sleep(1000);

   }
   catch(Exception e)
   {
    e.printStackTrace();

   }
   System.out.println(i);
  }


 }
 public static void main(String[] args) {
  Sleepdemo sd=new Sleepdemo();
  sd.start();
 }
}
