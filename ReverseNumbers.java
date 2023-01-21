package com.bridgelabz.examples;
import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum=0,rev;
        for (int i=num;num!=0;i++){
            rev=num%10;
            num=num/10;
            sum=sum*10+rev;
        }
        System.out.println("Reverse is: " +sum);

    }
}
