package com.java.program;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 25;
		int sqrNum= num*num;
		int temp =num;
		int len=0;
		
		while(num>0)
		{
			len++;
			num/=10;	
		}
		
		num=temp;
		
		int digit = 1;
		for (int i=1;i<=len;i++)
		{
			digit =digit*10;
		}
		
		int res =sqrNum %digit;
		if(num==res) 
			System.out.println("Automorphic");
		else
			System.out.println("Not Automorphic");
	}

}
