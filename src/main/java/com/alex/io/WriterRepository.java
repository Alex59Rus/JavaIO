package com.alex.io;

import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WriterRepository {
    //repository - классы, реализующие доступ к текстовым файлам
/*        File writerDirFile = new File("C:/Users/cudlo/Desktop/writers.json");
        File postsDirFile = new File("C:/Users/cudlo/Desktop/posts.json");
        File writerFile = new File(writerDirFile);
        File postsFile = new File(postsDirFile);*/
}
class LabelRepository {
    static File labelsDirFile = new File("labels");
    public static File labelsFile = new File(String.valueOf(labelsDirFile));
    int id;
    String name;
    public static List<LabelRepository> newLabel = new ArrayList<>();
    String jsonCollection = new Gson().toJson(newLabel);
    public LabelRepository(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "LabelRepository{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}