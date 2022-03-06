package com.alex.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.alex.io.Student.student1;
import static com.alex.io.Student.student2;

public class WriterRepository {
    //repository - классы, реализующие доступ к текстовым файлам
/*    static Student student1 = new Student(1,"Alex",23,178,70,5,4.78);
    static Student student2 = new Student(2,"Simon",18,180,65, student1.course, 4.01);*/
    static List studentList = new ArrayList();


    public List getStudentList() {
        return studentList;
    }
}
