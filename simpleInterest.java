package com.tgt.igniteplus;
import java.util.Scanner ;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter values for principle, time and rate of interest\n");
        float p,t,r,SI;
        p = s.nextFloat();
        t = s.nextFloat();
        r = s.nextFloat();
        SI = ( p * t * r ) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
