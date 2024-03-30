package com.java.program;
import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=scn.nextInt();
		System.out.println(strongnum(n));	
	}
	
	static boolean strongnum(int n)
	{
		int temp= n;
		int sum=0;
		while(n>0){
			sum+=fact(n%10);
			n/=10;
		}
		return temp == sum;
	}
	static int fact(int n){
		int fact = 1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		return fact;
	}

}
