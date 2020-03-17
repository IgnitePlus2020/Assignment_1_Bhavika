package com.tgt.igniteplus;
import java.util.*;
public class frac_whole {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double og,b;
        int a;
        System.out.println("Enter a number : \n");
        og = in.nextDouble();
        a = (int)og;
        b = og - a;
        int l = Double.toString(b).length()-2;
        b = b * Math.pow(10,l);
        int c = (int)b;
        System.out.println( a + " " + c);
}
