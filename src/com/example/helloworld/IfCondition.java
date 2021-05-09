package com.example.helloworld;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int fn = sc.nextInt();
        System.out.println("Enter second number: ");
        int sn = sc.nextInt();
        System.out.println("Enter third number: ");
        int tn = sc.nextInt();

        if (fn > sn && fn > tn) {
            System.out.println("First number is greater");
        } else if (sn > fn && sn > tn) {
            System.out.println("Second number is greater");
        } else if (sn == fn &&fn == tn) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Third number is greater");
        }
    }
}