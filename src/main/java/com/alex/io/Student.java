package com.alex.io;

public class Student extends Person {
    int course;
    double GPA;
    static Student student1 = new Student(1,"Alex",23,5,4.78);
    static Student student2 = new Student(2,"Simon",18, 1, 4.01);
    static Student student3 = new Student(3,"Peter",19,2,3.99);
    static Student student4 = new Student(4,"George",20,3,3.87);
    static Student student5 = new Student(5,"Tom",21,4,5);

    public Student(int id, String name, int age, int course,double GPA) {
        super(id, name, age);
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
                '}';
    }
}
