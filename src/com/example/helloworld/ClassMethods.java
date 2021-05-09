package com.example.helloworld;

public class ClassMethods {
    public void myPublicMethod(){
        System.out.println("Public Method");
    }
    static void myStaticMethod(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        myStaticMethod();
        ClassMethods cm = new ClassMethods();
        cm.myPublicMethod();
    }
}
