package exceptionhandling;

import java.util.Scanner;

public class LibraryBookIssue {

    // throws keyword
    static void issueBook(int books) throws Exception {

        if (books == 0) {

            // throw keyword
            throw new Exception("No books selected for issue.");

        } else if (books < 0 || books > 3) {

            // throw keyword
            throw new Exception("Invalid! You can issue only 1 to 3 books.");

        } else {

            System.out.println("Book(s) Issued Successfully.");
            System.out.println("Number of Books Issued: " + books);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Books to Issue: ");
        int books = sc.nextInt();

        // try block
        try {

            issueBook(books);

        }

        // catch block
        catch (Exception e) {

            System.out.println(e.getMessage());

        }

        // finally block
        finally {

            System.out.println("Thank You for Visiting the Library.");
            sc.close();

        }
    }
} 