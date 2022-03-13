package com.alex.io;

import java.util.ArrayList;
import java.util.List;

import static com.alex.io.Student.*;

public  class WriterRepository {
    //repository - классы, реализующие доступ к текстовым файлам
    static List<Object> studentList = new ArrayList<>();

    public void feelList() {
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }

}
