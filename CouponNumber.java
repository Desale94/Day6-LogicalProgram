package com.bridgelabz.examples;

public class CouponNumber {
        public static void main(String[] args) {
            char[] chars = "abcdefghijklmnop".toCharArray();
            int max = 100000000;
            double d = Math.random();
            int random = (int) (d * max);
            String s = "";
            System.out.println("random double " + d + " random at start " + random);

            while (random > 0) {
                s = s + (chars[random % chars.length]);
                random /= chars.length;
                System.out.println(random + "  " + random % chars.length + " sb is " + s);
            }

            String couponCode = s.toString();
            System.out.println("Coupon Code: " + couponCode);
        }
    }

