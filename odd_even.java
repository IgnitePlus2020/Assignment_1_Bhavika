package com.tgt.igniteplus;
import java.util.Scanner;
public class odd_even {
    public static void main(String [] args){
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a digit\n");
        a = in.nextInt();
        if(a % 2 == 0)
            System.out.println("Number is even\n");
        else
            System.out.println("Number is odd\n");

    }
}
