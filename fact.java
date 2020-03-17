package com.tgt.igniteplus;
import java.util.Scanner ;
public class fact {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Number whose factorial you want to find out : ");
            int n = sc.nextInt();
            int fact = 1;
            for(int i = 1; i <= n ; i++)
                fact *= i;
            System.out.println("Factorial of " + n + " is 5" + fact );
        }
}
