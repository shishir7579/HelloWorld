package com.example.helloworld;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        final float PI = 3.1415f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float radius = sc.nextFloat();

        float aoc = PI* (radius * radius);
        System.out.println("The area of circle is "+aoc);
    }
}
