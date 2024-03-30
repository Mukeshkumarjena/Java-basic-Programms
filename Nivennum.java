package com.java.program;

public class Nivennum {

	public static void main(String[] args){
		int num=45;
		int temp =num;
		int sum=0;
		
		while(num<0)
		{
			int rem = num%10;
			sum =sum+rem;
			num/=10;
			
		}
		if(temp%sum==0)
			System.out.println("niven");
		else 
			System.out.println("notniven");
	}
}