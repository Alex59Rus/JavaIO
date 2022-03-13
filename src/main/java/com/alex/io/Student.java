package com.alex.io;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private int course;
    public static List<Student> ourStudents = new ArrayList<Student>();
/*  static Student student1 = new Student("Alex",23,5);
    static Student student2 = new Student("Simon",18, 1);
    static Student student3 = new Student("Peter",19,2);
    static Student student4 = new Student("George",20,3);
    static Student student5 = new Student("Tom",21,4);*/
    public Student(int id, String name, int age, int course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() { return course; }

    @Override
    public String toString() {
        return "{" +
                "ID: " + id +
                "| name:" + name +
                "| age:" + age +
                "| course:" + course +
                "},";
    }
}
