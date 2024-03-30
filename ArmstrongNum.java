package com.java.program;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153;
		int temp=num;
		int len=0;
		int res=0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		num=temp;
		
		while(num>0)
		{
			int rem = num%10;
			int digit =1;
			for(int i=1;i<=len;i++)	
			{
				digit =digit *rem;
			}
			res =res +digit;
			num/=10;	
		}
		if(temp==res)System.out.println("Armstrong");
		else System.out.println("Not a Armstrog");
	}

}
