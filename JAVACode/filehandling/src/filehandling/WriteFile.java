package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("Student.txt");

            writer.write("Student Details\n");
            writer.write("-----------------------\n");
            writer.write("Name : Bindu\n");
            writer.write("USN : 1BI22CS001\n");
            writer.write("Department : CSE\n");
            writer.write("College : BIT\n");

            writer.close();

            System.out.println("Data Written Successfully");

        } catch (IOException e) {
            System.out.println("Error Occurred");
        }

    }
}