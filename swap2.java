package com.tgt.igniteplus;
import java.util.Scanner ;
public class swap2 {
    public static void main(String [] args){
     int a, b, temp = 0;
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of 2 numbers a and b");
        a = in.nextInt();
        b = in.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping : " + a + b);
    }


}
