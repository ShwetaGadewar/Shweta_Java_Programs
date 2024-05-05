package assignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		useScannerMethod();
	}
public static void useScannerMethod() {
	
	Scanner scanner=new Scanner(System.in);
	
	 System.out.print("Enter an integer: ");
	 int numInt = scanner.nextInt();
     System.out.println("You entered: " + numInt);

     System.out.print("Enter a double: ");
     double numDouble = scanner.nextDouble();
     System.out.println("You entered: " + numDouble);
     
     System.out.println("Enter a float:");
     float numfloat=scanner.nextFloat();
     System.out.println("you entered: "+numfloat);
     
     System.out.print("Enter a boolean (true/false): ");
     boolean bool = scanner.nextBoolean();
     System.out.println("You entered: " + bool);
     
     System.out.print("Enter a line of text: ");
     scanner.nextLine();
     String line = scanner.nextLine();
     System.out.println("You entered: " + line);
     
     System.out.print("Enter a word: ");
     String word = scanner.next();
     System.out.println("You entered: " + word);
     
     scanner.close();
     
    
    
	 
}
}
