package com.tgt.igniteplus;
import java.util.Scanner ;
public class arm {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int num, originalNumber, rem, res = 0;
    num = sc.nextInt();

    originalNumber = num;

    while (originalNumber != 0)
    {
        rem = originalNumber % 10;
        res += Math.pow(rem,3);
        originalNumber /= 10;
    }

    if(res == num)
        System.out.println(num + " is an Armstrong number.");
    else
        System.out.println(num + " is not an Armstrong number.");
}
}
