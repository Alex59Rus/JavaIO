package com.alex.io;

import java.io.*;

import static com.alex.io.Student.*;
import static com.alex.io.WriterRepository.studentList;
import static com.alex.io.WriterView.GSON;

public class WriterController {
    //controller - обработка запросов от пользователя
    public static void writingDataIntoFile() {
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/cudlo/Desktop/2.txt"))){
/*            FileOutputStream fos = new FileOutputStream("C:/Users/cudlo/Desktop/2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);*/

            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
            System.out.println("Данные успешно записаны в файл");
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//узнать что за исключение и перевести на человечий
    }

    public static void readDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/cudlo/Desktop/2.txt"))) {
/*            FileInputStream fis = new FileInputStream("C:/Users/cudlo/Desktop/2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);*/
            Student student = (Student) ois.readObject();
            String outputDataJsonFormat = GSON.toJson(student);
            System.out.println(outputDataJsonFormat);
/*            int studentsCount = ois.readInt();
            Student[] students1 = (Student[]) ois.readObject();
            System.out.println(Arrays.toString(students1));
            ois.close();*/
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
