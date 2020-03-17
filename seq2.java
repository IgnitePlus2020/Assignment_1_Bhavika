package com.tgt.igniteplus;
import java.util.Scanner ;
public class seq2 {
    public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n = in.nextInt();
    System.out.println("Sequence: ");
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0)
            System.out.print(-1 * i + "\t");
        else
            System.out.print(i + "\t");
    }

}
}
