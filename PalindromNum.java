package com.java.program;
import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
	
		
		int num=n1;
		int temp= num;
		int rev =0;
		while (num>0)
		{
			int rem= num%10;
			rev =rev *10 +rem;
			num =num/10;
		}
			if(temp == rev)
				System.out.println("Palindrome");
			else
				System.out.println("not Palindromes");
				
	}
}
