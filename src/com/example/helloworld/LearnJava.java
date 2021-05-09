package com.example.helloworld;

public class LearnJava {
    public static void main(String[] args) {
        int num1 = plusMethod(2,3);
        double num2 = plusMethod(1.2,2.3);
        System.out.println("int: "+num1);
        System.out.println("double: "+num2);
    }
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }
}