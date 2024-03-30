package com.java.program;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
	}

}
