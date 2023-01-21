package com.bridgelabz.examples;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int n1=0, n2=1, n3;
        for(int i=1;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println("Fibonacci series is: " +n1);
        }

    }
}
