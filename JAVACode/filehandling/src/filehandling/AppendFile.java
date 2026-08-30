package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("Student.txt", true);

            writer.write("\nPhone : 9876543210");
            writer.write("\nEmail : bindu@gmail.com");

            writer.close();

            System.out.println("Data Appended Successfully");

        } catch (IOException e) {

            System.out.println("Error Occurred");

        }

    }

}