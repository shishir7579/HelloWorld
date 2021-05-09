package com.example.helloworld;

public class stringJava {
    public static void main(String[] args) {
        String fname = "Shishir";
        String lname = "Shishir";
        String full_name = fname +" "+ lname ;
        int Lengthoffname = fname.length();
        int Lengthoflname = lname.length();
        System.out.println("The length of fname is "+Lengthoffname);
        System.out.println("The length of lname is "+Lengthoflname);
        System.out.println("The full name is "+full_name);

        if(fname.equals(lname)) {
            System.out.println("The first name is equals to last name");
        }
    }
}
