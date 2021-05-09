package com.example.helloworld;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the "+i+" array: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("The array at index "+i +" is "+arr[i]);
        }
    }
}