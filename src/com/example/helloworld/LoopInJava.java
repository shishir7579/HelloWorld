package com.example.helloworld;

public class LoopInJava {
    public static void main(String[] args) {
        int i;
        for (i = 100; i>=1; i--){
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
    }
}
