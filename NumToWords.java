package com.tgt.igniteplus;
import java.util.Scanner ;
public class NumToWords {
    public static void main(String[] args) {
        Scanner  s = new Scanner( System.in );
        System.out.println("Enter number : \n ");
        int n = s.nextInt();
        String Str = Integer.toString( n );
        for(int i = 0 ; i < Str.length() ; i++)
        {
            switch (Str.charAt( i ))
            {
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Zero ");
                    break;
                default:
                    System.out.print(" not a number  ");

            }


        }
    }
}
