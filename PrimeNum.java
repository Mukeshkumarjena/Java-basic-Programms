package com.java.program;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7;
		int count=0;
		//for (int i=2;i<=Math.sqrt(num);i++)
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)System.out.println("Prime Number");
		else System.out.println("Not Prime Number");
	}

}
