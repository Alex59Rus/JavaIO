package com.alex.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import static com.alex.io.LabelRepository.newLabel;

public class WriterController implements Serializable {
    //controller - обработка запросов от пользователя
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void writingDataIntoFile() {
        try {
            FileWriter writer = new FileWriter(LabelRepository.labelsDirFile,true);
            /*for (LabelRepository labels : newLabel) {
                Label newLabel = new Label();
                writer.write(GSON.toJson(newLabel));
            }*/
            writer.write(GSON.toJson(newLabel));
            newLabel.removeAll(newLabel);
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
        public static void readDataFromFile() {

/*            Scanner scanner = null;
            try {
                scanner = new Scanner(LabelRepository.labelsDirFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }*/
        }
}

