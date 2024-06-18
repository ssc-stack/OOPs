package org.example.encapsulation;

public class Student {
    // write the code of student class here
    private int age;
    private String name;

    void display() {
        System.out.println("My name is "+name+". I am "+age+" years old");
    }

    void sayHello(String name) {
        System.out.println(this.name+" says hello to "+name);
    }
}

