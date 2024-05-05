package practice;

import java.util.Scanner;

public class AssignmentIFElse {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (M/F) or 'C' for custom option: ");
        char gender = scanner.next().charAt(0);

        
        if (gender == 'M' || gender == 'm') {
            System.out.println("Tickets for male is 50");
            
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Ticket for females :30RS");
        
        } else if (gender == 'C' || gender == 'c') {
            System.out.println("Ticket for females :10RS");
          
        } else {
            System.out.println("Invalid input,Please enter 'M', 'F', or 'C'.");
        }

     
        scanner.close();
    }

}
