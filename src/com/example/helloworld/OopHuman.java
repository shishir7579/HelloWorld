package com.example.helloworld;

public class OopHuman {
    int ears = 2;
    int legs = 2;
    String name;

    public OopHuman(String name){
        this.name = name;
    }

    void walking(){
        System.out.println(name+" is walking;");
    }
    void eating(){
        System.out.println(name+" is eating;");
    }

    public static void main(String[] args) {
        OopHuman obj = new OopHuman("shishir");
        obj.walking();
        obj.eating();

        OopHuman obj2 = new OopHuman("Sushi");
        obj2.walking();
        obj2.eating();

    }
}
