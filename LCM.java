package com.java.program;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=20;
		int n2=5;
		
		int lcm= n1>n2? n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}

}
