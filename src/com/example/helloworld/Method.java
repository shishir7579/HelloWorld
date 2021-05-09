package com.example.helloworld;

public class Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = sum(a,b);
        System.out.println("The sum is "+sum);
    }

    public static int sum(int a,int b){
        return a + b;
    }
}
