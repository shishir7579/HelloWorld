package com.example.helloworld;

 class First {
     void show() {
         System.out.println("A: First");
     }
 }

 class Second extends First {
     void display() {
         System.out.println("B: Second");
     }
 }

 class Third extends First {
     void insert(){
         System.out.println("C: Third");
     }
 }

 class Fourth extends Third {
     void Test(){
         System.out.println("D: Fourth");
     }
 }

public class InheritanceDemo {
    public static void main(String[] args) {
        Fourth obj = new Fourth();
        obj.Test();
        obj.show();
        obj.insert();
    }
}