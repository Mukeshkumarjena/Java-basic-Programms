package com.java.program;

public class PascalT {
	public static void main(String[] args) {
		 int num = 5;
	        for (int i = 0; i < num; i++) {
	            int temp = 1;
	            for (int space = 0; space <= num - i; space++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print(" " + temp);
	                temp = temp * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	  }
}
