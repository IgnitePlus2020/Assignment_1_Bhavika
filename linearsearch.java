package com.tgt.igniteplus;
import java.util.Scanner ;
public class linearsearch {
    public static void main(String args[])
    {
        int loc, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");

        for (loc = 0; loc < n; loc++)
            array[loc] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (loc = 0; loc < n; loc++)
        {
            if (array[loc] == search)
            {
                System.out.println(search + " is present at location " + (loc + 1));
                break;
            }
        }
        if (loc == n)
            System.out.println(search + " isn't present in array.");
    }
}
