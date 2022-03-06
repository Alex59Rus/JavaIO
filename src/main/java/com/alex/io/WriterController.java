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

            for (Object students: WriterRepository.studentList) {
                oos.writeObject(students);
            }
/*            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
            oos.writeObject(student4);
            oos.writeObject(student5);*/
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

            int countStudents = ois.readInt();
            Student[] students1 = new Student[countStudents];

            for (int i = 0; i < countStudents; i++) {
                students1[i] = (Student) ois.readObject();
            }
            System.out.println(Arrays.toString(students1));


/*            Student student1 = (Student) ois.readObject();
            Student student2 = (Student) ois.readObject();
            Student student3 = (Student) ois.readObject();
            Student student4 = (Student) ois.readObject();
            Student student5 = (Student) ois.readObject();*/

/*            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);
            System.out.println(student4);
            System.out.println(student5);*/

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
