package com.alex.io;

import java.io.*;
import java.util.Scanner;

import static com.alex.io.WriterView.GSON;

public class WriterController {
    //controller - обработка запросов от пользователя
    static String path = "C:/Users/cudlo/Desktop/1.txt";

    public static Student inputInfo() {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        try {
            File file = new File(path);
            PrintWriter writer = new PrintWriter(file);
            System.out.print("Введите имя: ");
            String studentName = scanStr.nextLine();
            writer.write(studentName);
            System.out.print("Введите возраст: ");
            int studentAge = scanInt.nextInt();
            writer.write(studentAge);
            System.out.print("Введите курс: ");
            int studentCourse = scanInt.nextInt();
            writer.write(studentCourse);
            writer.write(GSON.toJson(new Student(studentName,studentAge,studentCourse)));
/*            writer.write(GSON.toJson(Student));
            System.out.println(GSON.toJson(newStudent));*/
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writingDataIntoFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path,true))){
            oos.writeObject(WriterController.inputInfo());
            System.out.println("Данные успешно записаны в файл");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readDataFromFile() {
        try /*(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) */{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Student student = (Student) ois.readObject();
            String outputDataJsonFormat = GSON.toJson(student);
            System.out.println(outputDataJsonFormat);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

