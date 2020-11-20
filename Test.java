package com.classprograms;

public class Test {

 public static void main(String[] args) {
  Customer siddu=new Customer();
  new Thread(){
   public void run()
   {
    siddu.withdrawl(15000);
    
   }
  }.start();
  new Thread(){
   public void run()
   {
    siddu.withdrawl(2000);
    
   }
  }.start();
   
  }

 }
 class Customer
 {
  int amount=10000;
  synchronized void withdrawl(int amount) {
   System.out.println("Going to withdraw.......");
   if(this.amount<amount)
   {
    System.out.println("Less balance go and deposite");
   try {
    wait();
   }
   catch(Exception e)
   {
    e.printStackTrace();
   }
   
  }
   this.amount-=amount;
   System.out.println("withdrawl completed....");
 }
  synchronized void Deposite(int amount) {
   System.out.println("going to deposite");
   this.amount+=amount;
   System.out.println("Deposite is done....");
   notify();
  }

}
