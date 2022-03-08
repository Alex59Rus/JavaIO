package com.alex.io;

import java.io.*;
import java.util.Scanner;

import static com.alex.io.Student.*;
import static com.alex.io.WriterView.GSON;

public class WriterController {
    //controller - обработка запросов от пользователя

    public static void writingDataIntoFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/cudlo/Desktop/2.txt"))){

            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
            System.out.println("Данные успешно записаны в файл");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//узнать что за исключение и перевести на человечий
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
class inputControl {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
}
