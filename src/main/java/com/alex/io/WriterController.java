package com.alex.io;

import java.io.*;
import java.util.Scanner;

import static com.alex.io.WriterView.GSON;

public class WriterController {
    //controller - обработка запросов от пользователя
    static String path = "C:/Users/cudlo/Desktop/2.txt";
    public static Object inputInfo() {
        Scanner scan = new Scanner(System.in);
        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            System.out.println("Введите имя: ");
            String studentName = scan.nextLine();
            writer.write(GSON.toJson(studentName));
            System.out.println("Введите возраст: ");
            int studentAge = scan.nextInt();
            writer.write(GSON.toJson(studentAge));
            System.out.println("Введите курс: ");
            int studentCourse = scan.nextInt();
            writer.write(GSON.toJson(studentCourse));
            Student newStudent = new Student((int) ((Math.random() + 1) * 99999), studentName, studentAge, studentCourse, Math.floor(Math.random() + 3));
            writer.write(GSON.toJson(newStudent));
            System.out.println(newStudent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writingDataIntoFile() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/cudlo/Desktop/2.txt",true))){
            oos.writeObject(WriterController.inputInfo());
/*          oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);*/
            System.out.println("Данные успешно записаны в файл");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/cudlo/Desktop/2.txt"))) {

            Student student = (Student) ois.readObject();
            String outputDataJsonFormat = GSON.toJson(student);
            System.out.println(outputDataJsonFormat);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

