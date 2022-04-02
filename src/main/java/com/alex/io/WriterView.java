package com.alex.io;

import java.util.Scanner;

import static com.alex.io.LabelRepository.newLabel;
import static com.alex.io.WriterController.readDataFromFile;
import static com.alex.io.WriterController.writingDataIntoFile;

public class WriterView {
    //view - все данные, необходимые для работы с консолью
    public static void selectChoice() {
        Scanner doChoice = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Показать список чего-то"); //DISPLAY
            System.out.println("2. Добавить новое что-то"); //CREATE
            System.out.println("3. Изменить данные чего-то"); //UPDATE
            System.out.println("4. Поиск данных о чём-то"); //SEARCH
            System.out.println("5. Удалить данные о чём-то"); //DELETE
            System.out.println("0. Сохранить и выйти"); //EXIT
            System.out.print("Сделайте выбор: ");
            choice = doChoice.nextInt();

            switch (choice) {
                case 1:
                    /*Gson gson = new Gson();
                    FileReader fr = null;
                    try {
                        fr = new FileReader(labelsDirFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            fr.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }*/
                    readDataFromFile();
                    break;
                case 2:
                    System.out.print("Введите ID: ");
                    Integer inputId = inputInt.nextInt();
                    System.out.print("Введите название: ");
                    String inputName = inputStr.nextLine();
                    newLabel.add(new LabelRepository(inputId,inputName));
                    writingDataIntoFile();
                    break;
                case 3:
                    break;
                case 4:
                    boolean found = false;
/*                    Iterator<LabelRepository> labelRepositoryIterator = newLabel.iterator();
                    System.out.print("Введите ID чего-то: ");
                    inputId = inputInt.nextInt();
                    while (labelRepositoryIterator.hasNext()) {
                        LabelRepository lr = labelRepositoryIterator.next();
                        if (lr.getId() == inputId) {
                            System.out.println(lr);
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Запись не найдена");
                        }
                    }*/
                    break;
                case 5:
                    break;
            }
        }while (choice != 0);
    }

}
