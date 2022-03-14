package com.alex.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterController {
    //controller - обработка запросов от пользователя
    static String path = "C:/Users/cudlo/Desktop/1.txt";
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void writingDataIntoFile() {
        try {
            FileWriter writer = new FileWriter(path,true);
            for (Student student : Student.ourStudents) {
                Student newStudent = new Student(student.getId(), student.getName(), student.getAge(), student.getCourse());
                writer.write(GSON.toJson(newStudent));
            }
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
        public static void readDataFromFile() {
        try {
            FileReader fr = new FileReader(path);
            fr.read();
            System.out.println();
/*            Student student = (Student) ois.readObject();
            System.out.println(GSON.toJson(student));*/
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

