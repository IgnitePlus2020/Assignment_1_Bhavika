package com.tgt.igniteplus;
import java.util.Scanner;
public class swap3 { public static void main(String[] args) {
    int a, b, c, temp;
    Scanner in = new Scanner(System.in);
    System.out.print("\n Enter the value of a, b and c ");
    a = in.nextInt();

    b = in.nextInt();

    c = in.nextInt();

    temp = b;
    b = a;
    a = c;
    c = temp;
    System.out.println("\nAfter swap: "+ a + b + c );
}
}
