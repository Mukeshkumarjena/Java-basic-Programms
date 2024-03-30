package com.java.program;

public class NextPrimenNum {

	    public static void main(String[] args) {
	        int n = 7;
	        int temp = n;

	        while (true) {
	            int count = 0;

	            for (int i = 1; i <= n; i++) {
	                if (n % i == 0)
	                    count++;
	            }

	            if (count == 2)
	                temp++;

	            int tcount = 0;

	            for (int i = 1; i <= temp; i++) {
	                if (temp % i == 0)
	                    tcount++;
	            }

	            if (tcount == 2) {
	                System.out.println(temp);
	                break; // Add a break statement to exit the loop once a prime number is found
	            }
	        }
	    }
	}
