package assignments;

import java.util.Scanner;

public class Assignment10 {
	final static double pi=3.14;
	public static void main(String[] args) {
		
      Scanner R1=new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      
    
      double radius = R1.nextDouble();

      
      double area = Math.PI * radius * radius;

      double circumference = 2 * Math.PI * radius;

     
      System.out.println("The area of the circle with radius " + radius + " is: " + area);
     
      
      System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);

      
		
		R1.close();
	}

}
