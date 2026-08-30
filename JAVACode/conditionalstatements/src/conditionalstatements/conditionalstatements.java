package conditionalstatements;
import java.util.Scanner;
public class conditionalstatements {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        // IF-ELSE-IF Example
	        System.out.print("Enter your marks: ");
	        int marks = sc.nextInt();

	        if (marks >= 90) {
	            System.out.println("Grade A");
	        } else if (marks >= 75) {
	            System.out.println("Grade B");
	        } else if (marks >= 50) {
	            System.out.println("Grade C");
	        } else {
	            System.out.println("Fail");
	        }

	        // SWITCH Example
	        System.out.print("\nEnter a number (1-3): ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Apple");
	                break;
	            case 2:
	                System.out.println("Banana");
	                break;
	            case 3:
	                System.out.println("Orange");
	                break;
	            default:
	                System.out.println("Invalid Choice");
	        }

	        sc.close();

	}

}
