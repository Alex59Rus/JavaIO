package com.alex.io;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    public Person (String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
