package com.alex.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Enumeration;

import static com.alex.io.WriterController.*;
import static com.alex.io.WriterRepository.*;

public class Writer {
    public static void main(String[] args) {
        // метод запускающий и объеиняющий все 4 класса
        writingDataIntoFile();
        readDataFromFile();

    }
}

