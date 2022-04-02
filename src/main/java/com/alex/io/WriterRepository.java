package com.alex.io;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

class WriterRepository {
    //repository - классы, реализующие доступ к текстовым файлам
        File writerDirFile = new File("writers.json");
        private int id;
        private String name;
        private List <PostRepository> posts;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PostRepository> getPosts() {
        return posts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosts(List<PostRepository> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "WriterRepository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", posts=" + posts +
                '}';
    }
}
class PostRepository {
    File postsDirFile = new File("posts.json");
    private int id;
    private String name;
    private List<LabelRepository> labels;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<LabelRepository> getLabels() {
        return labels;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabels(List<LabelRepository> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "PostRepository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", labels=" + labels +
                '}';
    }
}
class LabelRepository {
    static File labelsDirFile = new File("labels.json");
    private int id;
    private String name;
    public static List<LabelRepository> newLabel = new LinkedList<>();


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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LabelRepository{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}