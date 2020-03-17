package com.tgt.igniteplus;
import java.util.Scanner;
public class sum {
    public static void main(String[] args)
    {   int even = 0, odd = 0;
        Scanner s = new Scanner( System.in );
        System.out.println(" Enter the number of terms: ");
        int n = s.nextInt();
        for( int i = 0 ; i <= n ; i++ )
        {
            if( i % 2 == 0 )
                even = even + i;
            else
                odd = odd + i;
        }
        System.out.println(" Sum of even digits: " + even);
        System.out.println(" Sum of odd digits: " + odd);
    }
}
