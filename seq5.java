package com.tgt.igniteplus;
import java.util.Scanner;
public class seq5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Sequence :");
        for (int i = 1; i <= n; i++)
            System.out.print(i * i + "\t");
    }
}
