package com.alex.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class WriterController {
    //controller - обработка запросов от пользователя
    static String path = "C:/Users/cudlo/Desktop/1.txt";
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static Student createJson() {
        try {
            File file = new File(path);
            PrintWriter writer = new PrintWriter(file);
            writer.write(GSON.toJson(Student.ourStudents));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writingDataIntoFile() {
        try /*(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path,true)))*/{
            //oos.writeObject(createJson());
            FileWriter writer = new FileWriter(path);
            for (Student student : Student.ourStudents) {
/*                int id = WriterView.selectChoice.inputID();
                String name = Student.getName();
                int age = Student.getAge();
                int course = Student.getCourse();*/
                Student newStudent = new Student(student.getId(), student.getName(), student.getAge(), student.getCourse());
                writer.write(GSON.toJson(newStudent));
            }
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
//        System.out.println("Данные успешно записаны в файл");
/*        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/}
        public static void readDataFromFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Student student = (Student) ois.readObject();
            System.out.println(GSON.toJson(student));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

