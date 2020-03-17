package com.tgt.igniteplus;
import java.util.Scanner;
public class largest {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three unequal numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int largest, secondlargest;
        if(a>b) {
            if (a > c) {  //a>b a>c
                largest = a;
                if(c>b)   //a>b a>c c>b
                    secondlargest=c;
                else        //a>b a>c b>c
                    secondlargest=b;
            }
            else {      // c>a>b
                largest = c;
                secondlargest=a;
            }
        }
        else if (b>c) {  //b>a b>c
            largest = b;
            if(a>c)
                secondlargest=a;
            else
                secondlargest=c;
        }
        else {  // c>b>a
            largest = c;
            secondlargest=b;
        }
        System.out.println(largest+" is largest and "+secondlargest+" is second largest");
    }

    }

