package com.tgt.igniteplus;
import java.util.Scanner ;
public class binarySearch {
    public static void main(String args[])
    {
        int i, num, key, array[], first, last, mid;
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();
        array = new int[num];

        System.out.println("Enter " + num + " integers");
        for (i = 0; i < num; i++)
            array[i] = input.nextInt();

        System.out.println("Enter the search value:");
        key = input.nextInt();
        first = 0;
        last = num - 1;
        mid = (first + last)/2;

        while( first <= last )
        {
            if ( array[mid] < key )
                first = mid + 1;
            else if ( array[mid] == key )
            {
                System.out.println(key + " found at location " + (mid + 1));
                break;
            }
            else
            {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last )
            System.out.println(key + " is not found.\n");
    }
}
