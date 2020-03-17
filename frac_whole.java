package com.tgt.igniteplus;
import java.util.*;
public class frac_whole {
    public static void main(String[] args) {
        double value = 12.56;
        double fractional_part = value % 1;
        double whole_part = value - fractional_part;
        System.out.print("\nOriginal value: "+value);
        System.out.print("\nWhole part: "+whole_part);
        System.out.print("\nFractional part: "+fractional_part);
        System.out.println();
    }
}
