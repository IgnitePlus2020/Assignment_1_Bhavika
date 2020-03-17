package com.tgt.igniteplus;
import java.util.Scanner ;
public class seq1 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of num: ");
        num = in.nextInt();
        System.out.println("Sequence 1: ");
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i * i + "\t");
        }

    }
}