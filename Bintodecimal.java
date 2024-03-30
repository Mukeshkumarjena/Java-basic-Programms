package com.java.program;

public class Bintodecimal {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int bin =111;
		int dec =0;
		int i=1;
		
		while(bin>0)
		{
			int bit =bin %10;
			bin =  bin + (bit*i);
			i=i*10;
			dec/=2;
			
		}
		System.out.println(dec);
	}

}
