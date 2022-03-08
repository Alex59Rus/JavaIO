package com.alex.io;

import java.io.Serializable;

public class Person implements Serializable {
    transient int id;
    String name;
    int age;

    public Person (int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
