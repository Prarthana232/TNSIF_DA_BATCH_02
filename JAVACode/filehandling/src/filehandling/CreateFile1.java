package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

    public static void main(String[] args) {

        try {

            // Create a file named Student.txt
            File file = new File("Student.txt");

            if (file.createNewFile()) {
                System.out.println("Student.txt File Created Successfully");
            } else {
                System.out.println("Student.txt File Already Exists");
            }

        } catch (IOException e) {
            System.out.println("Error Occurred");
        }
    }
}