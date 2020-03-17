package com.tgt.igniteplus;
import java.util.Scanner ;
public class ser21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of terms");
        int n = sc.nextInt();
        int i , term = 1;
        for(i = 0; i < n;i++)
        {
            term = term +( i * i);
            if(i % 2 != 0)
                System.out.print("-");
            System.out.print( term + " ");

        }
    }
}
