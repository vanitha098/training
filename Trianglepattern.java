package com.classprograms;

public class Trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,k=1;
        for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(k%2==1)
				{
					System.out.print("1");
				}
				else 
				{
					System.out.print("0");
				}
			k++;
			}
			System.out.println();
      }
      
      
 }
 }
