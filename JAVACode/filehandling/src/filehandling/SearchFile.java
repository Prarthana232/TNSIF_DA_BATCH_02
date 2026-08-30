package filehandling;

import java.io.File;

public class SearchFile {

    public static void main(String[] args) {

        File file = new File("Student.txt");

        if (file.exists()) {
            System.out.println("File Found");
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
        } else {
            System.out.println("File Not Found");
        }
    }
}