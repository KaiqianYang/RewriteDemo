package com.example.demo;

import java.io.*;

public class ReadFileExample {
    public static void LinuxFile() {
            BufferedReader br = new BufferedReader(new FileReader("/home/project/targetfile"));
            br = new BufferedReader(new FileReader("../targetfile"));
    }

    public static void windowsBackslashes() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Windows\\example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void windowsforwardSlashes(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Windows/example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //comments
    public static void windowsFileUrl(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("file://localhost/c:/WINDOWS/clock.avi"));
            BufferedReader br = new BufferedReader(new FileReader("file:/c:/WINDOWS/clock.avi"));
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