package com.tgt.igniteplus;
import java.util.Scanner;
public class xpown {
    public static void main(String[] args) {
        int x = 0, n = 0, res = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base and exponent value: \n");
        x = in.nextInt();
        n = in.nextInt();
        int temp = n;
        while (temp > 0) {
            res *= x;
            temp --;
        }
        System.out.println(x + " power " + n + " is : " + res);
    }
}
