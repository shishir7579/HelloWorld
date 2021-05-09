package com.example.helloworld;

public class ClassAttribute {
    String fname = "Shishir";
    String lname = "Pokhrel";
    int age = 29;

    public static void main(String[] args) {
        ClassAttribute obj = new ClassAttribute();
        System.out.println("Name: "+obj.fname+" "+obj.lname);
        System.out.println("Age: "+obj.age);
    }
}

