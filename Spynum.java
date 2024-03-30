package com.java.program;

public class Spynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12;
		int sum=0;
		int prod=1;
		
		while(num>0)
		{
			int rem =num%10;
			sum =sum+rem;
			prod=prod*rem;
			num/=10;
			
		}
		if(sum==prod)System.out.println("Spynumber");
		else System.out.println("NotSpy");
	}

}
