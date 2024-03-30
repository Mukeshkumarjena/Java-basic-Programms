package com.java.program;
import java.util.Scanner;

public class Revsum_key {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int num = sc.nextInt();
        System.out.println("Enter a Key");
        int key = sc.nextInt();
        if (key >len(num)) {
            System.out.println("Enter a Valid Key");
            return ; 
        }
        int leng = len(num);
        int r = leng - key;
        int c = (int) Math.pow(10, r);
        int ans = rev(num) / c;
        System.out.println(sumdigit(ans));     
        	
    }

    static int len(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int rev(int n) {
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            res = res * 10 + rem;
            n /= 10;
        }
        return res;
    }

    static int sumdigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
