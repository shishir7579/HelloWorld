package com.example.helloworld;

class Parent{
    void display(){
        System.out.println("This is a parent class");
    }
    void Par(){
        System.out.println("This is a parent class method par");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("This is a child class");
    }
    void Chi(){
        System.out.println("This is a Child class method chi");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent obj = (Parent)new Child();
        obj.Par();
        obj.display();
    }
}
