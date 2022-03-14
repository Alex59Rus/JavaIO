package com.alex.io;

import java.util.Scanner;

import static com.alex.io.WriterController.readDataFromFile;

public class WriterView {
    //view - все данные, необходимые для работы с консолью
    public static void selectChoice() {
        Scanner doChoice = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Показать список студентов"); //DISPLAY
            System.out.println("2. Добавить нового студента"); //CREATE
            System.out.println("3. Изменить данные студента"); //UPDATE
            System.out.println("4. Поиск данных о студенте"); //SEARCH
            System.out.println("5. Удалить данные о студенте"); //DELETE
            System.out.println("0. Сохранить и выйти"); //EXIT
            System.out.print("Сделайте выбор: ");
            choice = doChoice.nextInt();

            switch (choice) {
                case 1:
                    /*System.out.println("----------------------");
                    Iterator<Student> c = Student.ourStudents.iterator();
                    while (c.hasNext()) {
                        Student e = c.next();
                        System.out.println(e);
                    }
                    System.out.println("----------------------");*/
                    readDataFromFile();
                    break;
                case 2:
                    System.out.print("Введите ID: "); //в дальнейшем вставить генератор ID + исключение совпадений
                    int inputId = inputInt.nextInt();
                    System.out.print("Введите Имя: ");
                    String inputName = inputStr.nextLine();
                    System.out.print("Введите возраст: ");
                    int inputAge = inputInt.nextInt();
                    System.out.print("Введите курс: ");
                    int inputCourse = inputInt.nextInt();
                    Student.ourStudents.add(new Student(inputId,inputName,inputAge,inputCourse));
                    WriterController.writingDataIntoFile();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while (choice != 0);
    }

}
