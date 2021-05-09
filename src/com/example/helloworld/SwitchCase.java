package com.example.helloworld;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("The day is Sunday ");
            case 2 -> System.out.println("The day is Monday");
            case 3 -> System.out.println("The day is Tuesday ");
            case 4 -> System.out.println("The day is Wednesday");
            case 5 -> System.out.println("The day is Thursday ");
            case 6 -> System.out.println("The day is Friday");
            case 7 -> System.out.println("The day is Saturday ");
            default -> System.out.println("Invalid option choosen");
        }
    }
}
