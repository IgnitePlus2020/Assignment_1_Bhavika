package com.tgt.igniteplus;
import java.util.Scanner ;
public class revString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();


        int l = str.length();
        String reverse="";
        for(int i = l - 1 ;i >= 0 ; i-- )
            reverse = reverse + str.charAt(i);
        System.out.println(reverse);
}}
