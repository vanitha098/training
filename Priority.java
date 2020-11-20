package com.classprograms;

public class Priority  extends Thread{
	public void run()
	{
		System.out.println("Thread Name"+Thread.currentThread().getName());
		System.out.println("Thread Priority"+Thread.currentThread().getPriority());
		System.out.println("Thread Id"+Thread.currentThread().getId());

	}

	public static void main(String[] args) {
		Priority p=new Priority();
		p.setPriority(MIN_PRIORITY);
		Priority p1=new Priority();
		p1.setPriority(MAX_PRIORITY);
		Priority p2=new Priority();
		p2.setPriority(NORM_PRIORITY);
		p.start();
		p1.start();
		p2.start();
	}

}
