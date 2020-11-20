package com.classprograms;
class Trainees{
 public synchronized void message(String companyName)
 {
  for(int i=0;i<10;i++) {
   System.out.println("welcome to the company");
   try {
    Thread.sleep(1000);
    System.out.println(companyName);
   }
   catch(Exception e)
   {
    e.printStackTrace();
   }
  }
 }
}
class mThread extends Thread
{
 Trainees c;
 String comapnyName;
 public mThread(Trainees c,String comapnyName) {
  this.c=c;
  this.comapnyName = comapnyName;
 }
 public void run()
 {
  c.message(comapnyName);
 }
}
public class ThreadSleep {

 public static void main(String[] args) {
  Trainees batch10=new Trainees();
  mThread x=new mThread(batch10,"Motivity");
  mThread y=new mThread(batch10,"JNIT");
  x.start();
  y.start();

 }
}
