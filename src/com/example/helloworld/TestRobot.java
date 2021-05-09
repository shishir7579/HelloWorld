package com.example.helloworld;

public class TestRobot {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.color = "Green";
        r1.name = "sofia";
        r1.version = 2;

        Robot r2 = new Robot();
        r2.color = "Black";
        r2.name = "Chitti";
        r2.version = 3;

        r1.introduceMe();
        r2.introduceMe();
    }
}

class Robot{
    String name;
    String color;
    int version;

    void introduceMe(){
        System.out.println("My name is "+this.name);
    }
}