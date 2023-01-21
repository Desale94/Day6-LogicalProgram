package com.bridgelabz.examples;

import java.util.Scanner;

public class StopWatch {
    //public static void main(String[] args) {
    static double start=0,stop=0;

    static void startTime(){
        start=System.currentTimeMillis();
        System.out.println("Start time: " +start);
    }
    static void stopTime(){
        stop=System.currentTimeMillis();
        System.out.println("Stop time: " +stop);
    }
    static void elapsedTime(){
        System.out.println("Elapsed time: " +(start - stop)/1000);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number to start");
        s.next();
        startTime();
        System.out.println("enter to stop");
        s.next();
        stopTime();
        elapsedTime();
    }
}
