package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment68CreateArrayWithBooleanDatatype {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		 Boolean[] booleanArray = new Boolean[3];
		 System.out.println("Enter values for the Boolean array:");
		 
		 for (int i = 0; i < booleanArray.length; i++) {
			
				System.out.print("Enter value for element " + (i + 1) + ": ");
	            booleanArray[i] = s1.nextBoolean();
	}
		
		 System.out.println(Arrays.toString(booleanArray));
	}
}












/* System.out.println("The Boolean array you entered:");
for (int i = 0; i < booleanArray.length; i++) {
       System.out.println("Element " + (i + 1) + ": " + booleanArray[i]);
   }*/
