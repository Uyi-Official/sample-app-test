package com.interswitch.maven;

import java.util.Scanner;

public class CalcOperations
{
    public static void main( String[] args )

    {
//        System.out.println( "Hello World!" );
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int x = scn.nextInt();
//        System.out.println("Enter second number");
//        int y = scn.nextInt();
//        add(x,y);

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        sub(x,y);
    }


    public void add(int x, int y){
        System.out.printf("The sum of %d and %d is %d",x,y,x+y);
        System.out.println();
//        System.out.println("--------------------------------");
    }

    public void sub(int x, int y){
        System.out.printf("The difference btw %d and %d is %d",x,y,x-y);
        System.out.println();
    }

    public void multiply(int x, int y){
        System.out.printf("The multiplication of %d and %d is %d",x,y,x*y);
        System.out.println();
    }

    public void divide(int x, int y){
        System.out.printf("The division of %d by %d is " + String.valueOf(x/y),x,y);
        System.out.println();
    }
}
