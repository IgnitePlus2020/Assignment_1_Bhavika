package com.tgt.igniteplus;
import java.util.Scanner ;
public class seq6 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number until which you want squares : ");
            int n = sc.nextInt();
            int i ;
            for(i = 1 ; ( i * i ) <= n ; i++)
                System.out.print(( i * i ) + " ");
        }
}
