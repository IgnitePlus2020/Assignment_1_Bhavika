package com.tgt.igniteplus;
import java.util.Scanner ;
public class deciToBin {
    public static void main(String args[])
    {
        int dec, quot, i=1, j;
        int bin[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec = sc.nextInt();

        quot = dec;

        while(quot != 0)
        {
            bin[i++] = quot%2;
            quot = quot/2;
        }

        System.out.print("Binary number is: ");
        for(j = i-1 ; j > 0; j--)
        {
            System.out.print(bin[j]);
        }
        System.out.print("\n");
    }
}
