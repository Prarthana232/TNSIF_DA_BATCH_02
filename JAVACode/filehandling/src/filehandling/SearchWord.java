package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchWord {

    public static void main(String[] args) {

        try {

            File file = new File("Student.txt");
            Scanner sc = new Scanner(file);

            String word = "Bindu";
            boolean found = false;

            while (sc.hasNext()) {
                if (sc.next().equals(word)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Word Found");
            } else {
                System.out.println("Word Not Found");
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}