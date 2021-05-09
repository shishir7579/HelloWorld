package com.example.helloworld;

public class EncapsulationDemo extends abc{
    public static void main(String[] args) {
        EncapsulationDemo obj1 = new EncapsulationDemo();
        obj1.test();

    }
}

class abc {
    protected void test(){
        System.out.println("This is test method of class abc");
    }
}