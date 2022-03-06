package com.alex.io;

import javax.swing.plaf.IconUIResource;

public class Student extends Person {
    int course;
    double GPA;
    static Student student1 = new Student(1,"Alex",23,178,70,5,4.78);
    static Student student2 = new Student(2,"Simon",18,180,65, 1, 4.01);
    static Student student3 = new Student(3,"Peter",19,190,88,2,3.99);
    static Student student4 = new Student(4,"George",20,185,78,3,3.87);
    static Student student5 = new Student(5,"Tom",21,175,71,4,5);

    public Student(int id, String name, int age, int height, int weight,int course,double GPA) {
        super(id, name, age, height, weight);
        this.course = course;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                ", course= " + course +
                ", GPA= " + GPA +
                ", name= '" + name + '\'' +
                ", age= " + age +
                ", height= " + height + "cm" +
                ", weight= " + weight + "kg" +
                '}';
    }
}
