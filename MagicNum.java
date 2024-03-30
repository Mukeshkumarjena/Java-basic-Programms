package com.java.program;

public class MagicNum {
	

	public static void main(String[] args) {
		
		int num=1458;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		//System.out.println(sum);
		
		num=sum;
		
			int rev=0;
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			//System.out.println(rev);
			
			if(temp==(sum*rev))
				System.out.println("is Magic ");
			else
				System.out.println("Not a magic");
		

	}

}
