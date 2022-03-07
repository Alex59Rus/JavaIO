package com.alex.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterRepository {
    //repository - классы, реализующие доступ к текстовым файлам
    static List studentList = new ArrayList();
    public List getStudentList() {
        return studentList;
    }
}
