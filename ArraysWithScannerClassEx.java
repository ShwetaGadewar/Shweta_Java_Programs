package BasicConcept;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysWithScannerClassEx {

	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
		 Boolean[] booleanArray = new Boolean[3];
		 Boolean[] booleanArray1 = new Boolean[3];
		 System.out.println("1st Array");
		 for (int i = 0; i < booleanArray.length; i++) {
				
				System.out.print("Enter value for element " + (i + 1) + ": ");
	            booleanArray[i] = s1.nextBoolean();
		 
		 }
		 System.out.println("======================================");
		 System.out.println("2nd Array");
		 for (int i = 0; i < booleanArray1.length; i++) {
				
				System.out.print("Enter value for element " + (i + 1) + ": ");
	            booleanArray1[i] = s1.nextBoolean();
		 
		 }
		 System.out.println(Arrays.equals(booleanArray, booleanArray1));
		 
		 if (Arrays.equals(booleanArray, booleanArray1) == true) {
				System.out.println("The array is same array");

			} else {
				System.out.println("The  Array is diffrent array");
			}
	}

}
