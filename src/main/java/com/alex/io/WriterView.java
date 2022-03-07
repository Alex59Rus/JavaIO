package com.alex.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WriterView {
    //view - все данные, необходимые для работы с консолью
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

}
