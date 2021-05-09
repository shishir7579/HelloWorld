package com.example.helloworld;

public class Constructor {
    int x;
    public Constructor(int x){
        this.x = x;
        System.out.println("This is constructor and x value is: "+x);
    }

    public static void main(String[] args) {
        Constructor ctr = new Constructor(2);
        System.out.println("Contructor initialized");
    }
}
