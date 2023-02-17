package com.example.demo;

import java.io.*;

public class ReadFileExample {

    public static void eg() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../pom.xml"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}