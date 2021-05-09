package com.example.helloworld;

class Test{
    void show(int a, double b){
        System.out.println("Show 1");
    }
    void show(double a, int b){
        System.out.println("Show 2");
    }
}
public class FunctionOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(100.00,200);
        t.show(100,200.00);
    }
}
