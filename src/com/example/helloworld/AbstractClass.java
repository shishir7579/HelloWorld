package com.example.helloworld;

abstract class main {
    public String fname = "Shishir";
    public int age = 28;
    public abstract void study();
}

class Student extends main {
    public int graduationYear = 2014;

    @Override
    public void study() {
        System.out.println("Studying all day long");
    }
}
class AbstractClass {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name: "+myObj.fname);
        System.out.println("Age: "+myObj.age);
        System.out.println("Graduation Year: "+myObj.graduationYear);
        myObj.study();
    }
    }