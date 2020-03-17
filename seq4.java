package com.tgt.igniteplus;
import java.util.Scanner ;
public class seq4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 7;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        System.out.println("Sequence:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
    }
}
