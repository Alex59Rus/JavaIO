package com.alex.io;

public class Student extends Person {
    int course;
/*    static Student student1 = new Student("Alex",23,5);
    static Student student2 = new Student("Simon",18, 1);
    static Student student3 = new Student("Peter",19,2);
    static Student student4 = new Student("George",20,3);
    static Student student5 = new Student("Tom",21,4);*/
    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "course=" + course +
                ", name=" + name +
                ", age=" + age +
                "}";
    }
}
