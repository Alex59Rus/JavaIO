package com.alex.io;

import java.io.*;
import java.util.Arrays;

import static com.alex.io.Student.*;

public class WriterController {
    //controller - обработка запросов от пользователя
    public static void inputStream() {
        WriterRepository.studentList.add(student1);
        WriterRepository.studentList.add(student2);
        WriterRepository.studentList.add(student3);
        WriterRepository.studentList.add(student4);
        WriterRepository.studentList.add(student5);
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/cudlo/Desktop/2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(WriterRepository.studentList.size());
            oos.writeObject(WriterRepository.studentList);
            System.out.println("Данные успешно записаны в файл");
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//узнать что за исключение и перевести на человечий
    }

    public static void readObject() {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/cudlo/Desktop/2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int studentsCount = ois.readInt();
            Student students1 = new Student(WriterRepository.studentList.size());
            for (int i = 0; i < ; i++) {
                
            }

/*            Student students = (Student) ois.readObject();
            System.out.println(students);*/
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
