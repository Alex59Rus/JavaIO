package com.alex.io;

import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;
    int age;
    int height;
    double weight;

    public Person (int id, String name, int age, int height, int weight) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
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

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
